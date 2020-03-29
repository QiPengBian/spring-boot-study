package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-28 17:04:00
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SeataBusinessTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataBusinessTransactionApplication.class, args);
    }
}
