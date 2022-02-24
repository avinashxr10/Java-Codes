package com.jtcindia.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JTC25 {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Jtcindia.xml");
		ctx.start();
		JTCManager jtc = (JTCManager) ctx.getBean("jtc");
		Batch b = new Batch("B-16", "30-march-2021", "2.30-4.30", 150);
		jtc.addBatch(b);
		Workshop ws = new Workshop("Web Service", 500000, 99);
		jtc.addWorkshop(ws);
		ctx.stop();
		ctx.close();

	}

}
