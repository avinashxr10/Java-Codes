package com.Spring4;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PreDestroy;

public class Hello implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    static {
        System.out.println("Hello - Static Block");
    }

    int x;
    String str;
    String msg;
    String bname;
    @Autowired
    A aobj;
    @Autowired
    B bobj;
    ApplicationContext ctx1;
    BeanFactory factory1;
    @Autowired
    ApplicationContext ctx2;
    @Autowired
    BeanFactory factory2;

    public Hello(int x) {
        System.out.println("Hello - (int x)");
        this.x = x;
    }

    public void setStr(String str) {
        System.out.println("Hello - setStr()");
        System.out.println(aobj);
        System.out.println(bobj);
        this.str = str;
    }

    public void setBobj(B bobj) {
        System.out.println("Hello - setBobj()");
        this.bobj = bobj;
    }

    public void init1() {
        System.out.println("Hello - init1()");
        msg = "Welcome to JTC";
        if (str == null) {
            str = "Hai Guys";
        }
        str = "hai Guys";
    }

    public void myInit() {
        System.out.println("Hello - myInit1()");
        msg = "Welcome to JTC";
        if (str == null) {
            str = "hai Guys";
        }
    }

    public void setBeanFactory(BeanFactory factory1) {
        System.out.println("Hello - setBeanFactory()");
        this.factory1 = factory1;
    }

    public void setApplicationContext(ApplicationContext ctx1) {
        System.out.println("Hello - setApplicationContext");
        this.ctx1 = ctx1;
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Hello - cleanUp()");
    }

    public void destroy() throws Exception{
        System.out.println("Hello - Destroy()");
    }

    public void myCleanUp(){
        System.out.println("Hello - myCleanUp()");
    }

    public void show(){
        System.out.println("Hello - show()");
        System.out.println(x);
        System.out.println(str);
        System.out.println(msg);
        System.out.println("Bean Name is " + bname);
        System.out.println(factory1);
        System.out.println(ctx1);
        System.out.println(factory2);
        System.out.println(ctx2);
        System.out.println(ctx1 == ctx2);
        System.out.println(factory1 == factory2);

    }

    @Override
    public void setBeanName(String bname) {
        System.out.println("Hello - setBeanName()");
        this.bname = bname;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello - afterPropertiesSet()");
    }
}
