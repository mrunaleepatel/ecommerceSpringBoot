package com.onlineshopping.springboot.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
public class Role {
    @Id
    private String roleName;
    private String roleDescription;

    public void setRoleName(String roleName) {this.roleName = roleName;}

    public void setRoleDescription(String roleDescription) {this.roleDescription = roleDescription;}

}
