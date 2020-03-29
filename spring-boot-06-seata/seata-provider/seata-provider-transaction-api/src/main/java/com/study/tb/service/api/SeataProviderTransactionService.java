package com.study.tb.service.api;


import com.study.tb.domain.Order;
import com.study.tb.domain.OrderItem;

public interface SeataProviderTransactionService {
    void createOrder(Order order, OrderItem orderItem);
}
