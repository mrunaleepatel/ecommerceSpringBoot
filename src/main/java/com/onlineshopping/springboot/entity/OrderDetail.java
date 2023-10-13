package com.onlineshopping.springboot.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;
    private String orderFullName;
    private String orderFullOrder;
    private String orderContactNumber;
    private String orderAlternateContactNumber;
    private String orderStatus;
    private Double orderAmount;
    @OneToOne
    private Product product;
    @OneToOne
    private User user;
    private String transactionId;
    public OrderDetail() {

    }
    public OrderDetail(String orderFullName, String orderFullOrder, String orderContactNumber, String orderAlternateContactNumber, String orderStatus, Double orderAmount, Product product, User user, String transactionId) {
        this.orderFullName = orderFullName;
        this.orderFullOrder = orderFullOrder;
        this.orderContactNumber = orderContactNumber;
        this.orderAlternateContactNumber = orderAlternateContactNumber;
        this.orderStatus = orderStatus;
        this.orderAmount = orderAmount;
        this.product = product;
        this.user = user;
        this.transactionId = transactionId;
    }

    public void setTransactionId(String transactionId){this.transactionId = transactionId;}

    public void setProduct(Product product){this.product = product;}

    public void setUser(User user){this.user = user;}

    public void setOrderId(Integer orderId) {this.orderId = orderId;}

    public void setOrderFullName(String orderFullName) {this.orderFullName = orderFullName;}

    public void setOrderFullOrder(String orderFullOrder) {this.orderFullOrder = orderFullOrder;}

    public void setOrderContactNumber(String orderContactNumber) {this.orderContactNumber = orderContactNumber;}

    public void setOrderAlternateContactNumber(String orderAlternateContactNumber) {
        this.orderAlternateContactNumber = orderAlternateContactNumber;
    }

    public void setOrderStatus(String orderStatus) {this.orderStatus = orderStatus;}

    public void setOrderAmount(Double orderAmount) {this.orderAmount = orderAmount;}

}

