package com.xzh.sharding.service;

import com.xzh.sharding.entity.Order;
import com.xzh.sharding.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author 向振华
 * @date 2020/12/08 12:00
 */
@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    public void save(Order entity) {
        orderRepository.save(entity);
    }

    public Order get(Long orderId) {
        Optional<Order> order = orderRepository.findById(orderId);
        return order.orElse(new Order());
    }
}
