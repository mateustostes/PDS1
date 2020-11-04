package com.iftm.course.repositories;

import org.springframework.stereotype.Repository;

import com.iftm.course.entities.Order;

@Repository
public class OrderRepository extends JpaRepository<Order, Long> {

}
