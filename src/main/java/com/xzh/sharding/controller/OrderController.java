package com.xzh.sharding.controller;

import com.xzh.sharding.entity.Order;
import com.xzh.sharding.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author 向振华
 * @date 2020/12/08 12:00
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/save")
    public String save(@RequestParam("userId") Long userId) {
        Order entity = new Order();
        entity.setUserId(userId);
        entity.setStatus(new Random().nextInt(9));
        orderService.save(entity);
        return "success";
    }

    @GetMapping("/get")
    public Order get(@RequestParam("orderId") Long orderId) {
        return orderService.get(orderId);
    }

}
