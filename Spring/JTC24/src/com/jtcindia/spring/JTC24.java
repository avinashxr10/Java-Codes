package com.jtcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JTC24 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Jtcindia.xml");
		Student stu = (Student) ctx.getBean("Student");

		System.out.println(stu.getSid().getBid());
		System.out.println(stu.getSid().getSid());
		System.out.println(stu.getSname());
		System.out.println(stu.getPhone());
		System.out.println(stu.getFee().getFeebal());
		System.out.println(stu.getFee().getFeepaid());
		System.out.println(stu.getFee().getTotalfee());
		System.out.println(stu.getEmails());
		System.out.println(stu.getPhones());

	}

}
