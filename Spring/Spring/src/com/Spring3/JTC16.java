package com.Spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JTC16 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jtcindia16.xml");
        Hello3 hello3 = (Hello3) ctx.getBean("hello3");
        hello3.show();
    }
}
