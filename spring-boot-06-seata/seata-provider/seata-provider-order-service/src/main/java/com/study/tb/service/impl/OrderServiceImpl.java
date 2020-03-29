package com.study.tb.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.tb.domain.Order;
import com.study.tb.mapper.OrderMapper;
import com.study.tb.service.api.OrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "0.0.1")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService, IService<Order> {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void insert(Order order) {
        this.orderMapper.insert(order);
    }
}
