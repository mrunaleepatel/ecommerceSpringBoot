package com.onlineshopping.springboot.entity;

import lombok.Getter;

import static com.mysql.cj.conf.PropertyKey.PASSWORD;

@Getter
public class JwtRequest {
    private String userName;
    private String userPassword;

    public void setUserName(String userName) {this.userName = userName;}

    public void setUserPassword(String userPassword) {this.userPassword = userPassword;}
}
