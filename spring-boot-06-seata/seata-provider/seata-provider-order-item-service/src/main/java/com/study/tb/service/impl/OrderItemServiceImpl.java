package com.study.tb.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.tb.domain.OrderItem;
import com.study.tb.mapper.OrderItemMapper;
import com.study.tb.service.api.OrderItemService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "0.0.1")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService, IService<OrderItem> {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public void insert(OrderItem orderItem) {
        this.orderItemMapper.insert(orderItem);
    }
}
