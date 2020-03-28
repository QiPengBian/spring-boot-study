package com.study.tb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.tb.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}