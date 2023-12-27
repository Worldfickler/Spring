package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.service.UserService;

/**
 * @author Fickler
 * @date 2023/12/26 18:16
 */
public class UserServiceImpl implements UserService {

    // BeanFactory 调用该方法，从容器中获取 userdao 并设置到此处
    public void setUserDao(UserDao userDao) {
        System.out.println(userDao);
    }

}
