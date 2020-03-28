package com.study.tb.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.tb.domain.Permission;
import com.study.tb.mapper.PermissionMapper;
import com.study.tb.service.PermissionService;
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService{

}
