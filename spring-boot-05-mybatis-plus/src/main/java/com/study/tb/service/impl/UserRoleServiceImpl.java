package com.study.tb.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.tb.mapper.UserRoleMapper;
import com.study.tb.domain.UserRole;
import com.study.tb.service.UserRoleService;
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService{

}
