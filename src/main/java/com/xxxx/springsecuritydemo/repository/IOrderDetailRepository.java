package com.xxxx.springsecuritydemo.repository;

import com.xxxx.springsecuritydemo.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDetailRepository extends JpaRepository<OrderDetail, Integer> {

    @Override
    OrderDetail getOne(Integer id);



}
