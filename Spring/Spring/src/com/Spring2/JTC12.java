package com.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JTC12 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jtcindia12.xml");
        Hello hello = (Hello) ctx.getBean("hello");
        hello.show();
    }
}
