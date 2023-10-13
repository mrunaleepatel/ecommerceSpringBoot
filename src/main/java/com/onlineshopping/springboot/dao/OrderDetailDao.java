package com.onlineshopping.springboot.dao;

import com.onlineshopping.springboot.entity.OrderDetail;
import com.onlineshopping.springboot.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    List<OrderDetail> findByUser(User user);
    List<OrderDetail> findByOrderStatus(String status);
}
