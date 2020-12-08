package com.xzh.sharding.repository;

import com.xzh.sharding.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 向振华
 * @date 2020/12/08 12:00
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
