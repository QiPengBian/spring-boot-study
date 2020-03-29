package com.study.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-17 22:38:00
 */
@Configurable
@MapperScan(basePackages = "com.study.**.mapper")
public class MybatisPlusConfig {
    /**
     * @author: QiPeng
     * @description: 分页插件
     * @createTime: 2020-03-15 11:54:00
     * @return: PaginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
