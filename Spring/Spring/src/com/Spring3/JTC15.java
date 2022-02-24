package com.Spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JTC15 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jtcindia15.xml");
        Hello2 hello2 = (Hello2) ctx.getBean("hello2");
        hello2.show();
    }
}
