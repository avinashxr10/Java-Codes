package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JTC7 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jtcindia5.xml");
        Hello hello = (Hello) ctx.getBean("hello");
        hello.show();
    }
}
