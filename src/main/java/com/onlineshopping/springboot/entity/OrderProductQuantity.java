package com.onlineshopping.springboot.entity;

import lombok.Getter;

@Getter
public class OrderProductQuantity {
    private Integer productId;
    private Integer quantity;

    public void setProductId(Integer productId) {this.productId = productId;}

    public void setQuantity(Integer quantity) {this.quantity = quantity;}

}
