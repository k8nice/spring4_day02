package com.nice.spring.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService") //<bean id="userService> class="com.nice.spring.demo1.UserServiceImpl"/>
public class UserServiceImpl implements UserService{

    /**
     * 注入UserDao
     */
//    @Autowired
//    @Qualifier(value = "userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("userService的save方法执行了");
        userDao.save();
    }
}
