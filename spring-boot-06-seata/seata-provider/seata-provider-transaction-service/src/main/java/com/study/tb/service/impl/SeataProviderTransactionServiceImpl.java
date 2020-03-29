package com.study.tb.service.impl;


import com.study.tb.domain.Order;
import com.study.tb.domain.OrderItem;
import com.study.tb.service.api.OrderItemService;
import com.study.tb.service.api.OrderService;
import com.study.tb.service.api.SeataProviderTransactionService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "0.0.1")
public class SeataProviderTransactionServiceImpl implements SeataProviderTransactionService {

    @Reference(version = "0.0.1")
    private OrderService orderService;

    @Reference(version = "0.0.1")
    private OrderItemService orderItemService;

    @Override
    @GlobalTransactional
    public void createOrder(Order order, OrderItem orderItem) {
        orderService.insert(order);
        orderItemService.insert(orderItem);

        // 抛出异常用以测试分布式事务是否回滚
        if (order.getUserId().equals(1L)) {
            throw new RuntimeException("Exception for seata.");
        }
    }
}
