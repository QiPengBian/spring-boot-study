package com.study.controller;

import com.study.tb.service.api.SeataProviderTransactionService;
import com.study.tb.domain.Order;
import com.study.tb.domain.OrderItem;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "transaction")
public class SeataBusinessTransactionController {

    @Reference(version = "0.0.1")
    private SeataProviderTransactionService transactionService;

    @GetMapping(value = "create/order")
    public String createOrder() {
        Order order = new Order();
        order.setOrderId(1L);
        order.setUserId(1L);

        OrderItem orderItem = new OrderItem();
        orderItem.setUserId(1L);
        orderItem.setOrderId(1L);
        orderItem.setOrderItemId(1L);

        transactionService.createOrder(order, orderItem);
        return "ok";
    }
}
