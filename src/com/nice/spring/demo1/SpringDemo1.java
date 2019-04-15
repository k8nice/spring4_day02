package com.nice.spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring的IOC的注解开发的测试类
 * @author nice
 */
public class SpringDemo1 {

    /**
     * 传统方式
     */
    @Test
    public void demo1(){
//        UserDao userDao = new UserDaoImpl();
        UserDaoImpl userDao = new UserDaoImpl();
//        userDao.setName("nice");
        userDao.save();
    }

    /**
     * Spring的IOC的注解方式
     */
    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }

    /**
     * Spring的IOC的注解方式
     */
    @Test
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }
}
