package com.onlineshopping.springboot.entity;

import lombok.Getter;

import java.util.List;

@Getter
public class OrderInput {
    private String fullName;
    private String fullAddress;
    private String contactNumber;
    private String alternateContactNumber;
    private String transactionId;
    private List<OrderProductQuantity> orderProductQuantityList;

    public void setTransactionId(String transactionId){this.transactionId = transactionId;}

    public void setFullName(String fullName){this.fullName = fullName;}

    public void setFullAddress(String fullAddress){this.fullAddress = fullAddress;}

    public void setContactNumber(String contactNumber){this.contactNumber = contactNumber;}

    public void setAlternateContactNumber(String alternateContactNumber) {
        this.alternateContactNumber = alternateContactNumber;
    }

    public void setOrderProductQuantityList(List<OrderProductQuantity> orderProductQuantityList) {
        this.orderProductQuantityList = orderProductQuantityList;}
}
