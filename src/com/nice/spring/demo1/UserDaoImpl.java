package com.nice.spring.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 用户DAO的实现类
 * @author nice
 */
//@Component(value = "userDao")   //"value"可以省略,相当于<bean id="userDao" class="com.nice.spring.demo1.UserDao">
@Repository("userDao")
public class UserDaoImpl implements UserDao{

    @Value("王东")
    private String name;

//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void save() {
        System.out.println("DAO中保存用户的方法执行了..."+name);
    }
}
