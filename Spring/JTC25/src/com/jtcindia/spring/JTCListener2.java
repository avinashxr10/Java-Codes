package com.jtcindia.spring;

import org.springframework.context.ApplicationListener;

public class JTCListener2 implements ApplicationListener<BatchEvent> {
	public void onApplicationEvent(BatchEvent event) {
		System.out.println("JTCListener 2 onApplicationEvent()");
		System.out.println("Batch event is raised");
		BatchEvent be = (BatchEvent) event;
		System.out.println(be.getBatch());
	}

}
