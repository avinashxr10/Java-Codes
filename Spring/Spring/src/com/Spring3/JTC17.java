package com.Spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JTC17 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jtcindia17.xml");
        Hello4 hello4 = (Hello4) ctx.getBean("hello4");
        hello4.show();
    }
}
