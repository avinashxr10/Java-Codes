package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JTC {
    public static void main(String[] args) {
        A aobj = new A();
        aobj.setA(99);
        aobj.setMsg("Hello Guys");

        B bobj = new B(88, "Hello Guys");
        Hello hello = new Hello(bobj);
        hello.setAobj(aobj);
        hello.show();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("jtcindia.xml");
        System.out.println("Spring Container is Ready");
        System.out.println("-------------------------");
        Hello h = (Hello) ctx.getBean("hello");
        h.show();
    }
}
