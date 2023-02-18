package com.fu.mapper;

import com.fu.entity.User;

import java.util.List;

/**
 * @Auther: Fuys
 * @Date: 2023/2/14 - 02 - 14 - 21:40
 * @Description: com.fu.mapper
 * @version: 1.0
 */
public interface UserMapper {
    public User showUserAndOrders();
    public List<User> showUsersAndRoles();
}
