package com.study.tb.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.tb.domain.RolePermission;
import com.study.tb.mapper.RolePermissionMapper;
import com.study.tb.service.RolePermissionService;
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService{

}
