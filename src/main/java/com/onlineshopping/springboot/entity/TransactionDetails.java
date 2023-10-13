package com.onlineshopping.springboot.entity;

import lombok.Getter;

@Getter
public class TransactionDetails {
    private String orderId;
    private String currency;
    private Integer amount;
    private String key;

    public TransactionDetails(String orderId, String currency, Integer amount, String key) {
        this.orderId = orderId;
        this.currency = currency;
        this.amount = amount;
        this.key = key;
    }

    public void setKey(String key){this.key = key;}

    public void setOrderId(String orderId) {this.orderId = orderId;}

    public void setCurrency(String currency) {this.currency = currency;}

    public void setAmount(Integer amount) {this.amount = amount;}

}
