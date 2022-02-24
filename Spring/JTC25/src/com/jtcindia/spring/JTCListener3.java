package com.jtcindia.spring;

import org.springframework.context.ApplicationListener;

public class JTCListener3 implements ApplicationListener<WorkshopEvent> {
	public void onApplicationEvent(WorkshopEvent event) {
		System.out.println("JTCListener 3 onApplicationEvent()");
		System.out.println("WorkshopEvent is raised");
		WorkshopEvent be = (WorkshopEvent) event;
		System.out.println(be.getWorkshop());
	}
}
