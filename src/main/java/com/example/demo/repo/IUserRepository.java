package com.example.demo.repo;

import com.example.demo.model.User;

import java.util.List;

/**
 * @author: Cavan.Liu
 * @date: 2019-07-17 10:09:47
 * @description:
 */
public interface IUserRepository {
    /**
     * 新增或者修改用户
     * @param user
     * @return
     */
    User saveOrUpateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取所有用户的列表
     * @return
     */
    List<User> listUser();
}
