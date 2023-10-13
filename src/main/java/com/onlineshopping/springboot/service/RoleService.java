package com.onlineshopping.springboot.service;

import com.onlineshopping.springboot.dao.RoleDao;
import com.onlineshopping.springboot.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }

}
