package com.Spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JTC14 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jtcindia14.xml");
        Hello1 hello1 = (Hello1)ctx.getBean("hello1");
        hello1.show();
    }
}
