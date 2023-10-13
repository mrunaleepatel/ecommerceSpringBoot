package com.onlineshopping.springboot.dao;

import com.onlineshopping.springboot.entity.Cart;
import com.onlineshopping.springboot.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer> {
    List<Cart> findByUser(User user);
}
