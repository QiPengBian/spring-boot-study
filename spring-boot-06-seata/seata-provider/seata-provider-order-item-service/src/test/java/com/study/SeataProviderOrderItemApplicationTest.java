package com.study;

import com.study.tb.domain.OrderItem;
import com.study.tb.service.api.OrderItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-28 19:24:00
 */
@SpringBootTest
public class SeataProviderOrderItemApplicationTest {

    @Autowired
    private OrderItemService orderItemService;

    @Test
    public void listTest() {
        OrderItem orderItem = OrderItem.builder().userId(1L).orderId(1L).orderItemId(1L).build();
        orderItemService.insert(orderItem);
    }

}
