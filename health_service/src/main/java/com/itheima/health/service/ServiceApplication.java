package com.itheima.health.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceApplication {
    public static void main(String[] args) throws Exception{
        new ClassPathXmlApplicationContext("classpath:applicationContext-service.xml");
        System.in.read();
    }
}
