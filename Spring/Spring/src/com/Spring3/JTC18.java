package com.Spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JTC18 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jtcindia18.xml");
        Hello5 hello5 = (Hello5) ctx.getBean("hello5");
        hello5.show();
    }
}
