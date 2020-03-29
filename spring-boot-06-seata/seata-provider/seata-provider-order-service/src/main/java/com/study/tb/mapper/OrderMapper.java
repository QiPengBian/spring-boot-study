package com.study.tb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.tb.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}