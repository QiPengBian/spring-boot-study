package com.study.tb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.tb.domain.Permission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {
}