package com.jtcindia.spring;

import org.springframework.context.*;
//import org.springframework.context.ApplicationListener;

public class JTCListener1 implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof BatchEvent) {
			BatchEvent batchEvent = (BatchEvent) event;
			Batch bat = batchEvent.getBatch();
			System.out.println(bat);
		} else if (event instanceof WorkshopEvent) {
			WorkshopEvent wsEvent = (WorkshopEvent) event;
			Workshop ws = wsEvent.getWorkshop();
			System.out.println(ws);
		} else {
			System.out.println(event);
		}
	}

}
