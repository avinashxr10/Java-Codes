package com.jtcindia.spring;

import org.springframework.context.*;
//import org.springframework.context.ApplicationContextAware;

public class JTCManager implements ApplicationContextAware {
	ApplicationContext ctx = null;

	public void addBatch(Batch bat) {
		ctx.publishEvent(new BatchEvent(this.bat));
	}

	public void addWorkshop(Workshop ws) {
		ctx.publishEvent(new WorkshopEvent(this.ws));
	}

	public void setApplicationContext(ApplicationContext ctx) {
		this.ctx = ctx;
	}

}
