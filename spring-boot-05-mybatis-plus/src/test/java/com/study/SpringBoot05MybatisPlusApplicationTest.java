package com.study;

import com.study.tb.domain.Permission;
import com.study.tb.domain.User;
import com.study.tb.domain.UserRole;
import com.study.tb.service.PermissionService;
import com.study.tb.service.RolePermissionService;
import com.study.tb.service.UserRoleService;
import com.study.tb.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-28 16:39:00
 */
@SpringBootTest
public class SpringBoot05MybatisPlusApplicationTest {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private RolePermissionService rolePermissionService;

    @Test
    void contextLoads() {
        List<User> userList = userService.list();
        userList.forEach(System.out::println);
    }

    @Test
    void userRoleTest() {
        List<UserRole> userRoleList = userRoleService.list();
        userRoleList.forEach(System.out::println);
    }

    @Test
    void permissionServiceTest() {
        List<Permission> permissionList = permissionService.list();
        permissionList.forEach(System.out::println);
    }
}
