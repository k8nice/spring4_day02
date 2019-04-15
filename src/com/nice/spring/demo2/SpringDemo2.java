package com.nice.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
    @Test
    public void demo1(){
        System.out.println("==================");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");

        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService2 = (CustomerService) applicationContext2.getBean("customerService");
        System.out.println(customerService);
        System.out.println(customerService2);
        ((ClassPathXmlApplicationContext) applicationContext).close();
        ((ClassPathXmlApplicationContext) applicationContext2).close();
    }
}
