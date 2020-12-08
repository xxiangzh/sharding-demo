package com.xzh.sharding.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 向振华
 * @date 2020/12/08 12:00
 */
@Data
@Entity
@Table(name = "t_order")
public class Order implements Serializable {
    private static final long serialVersionUID = -5635588853460084942L;

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Long userId;

    private Integer status;
}
