package com.nice.spring.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("customerService")
@Scope("singleton")
public class CustomerService {

    @PostConstruct//相当于init-method
    public void init(){
        System.out.println("CustomerService被初始化了");
    }

    public void save(){
        System.out.println("service的save方法执行了");
    }

    @PreDestroy//相当于destroy-method
    public void destroy(){
        System.out.println("CustomerService被销毁了");
    }
}
