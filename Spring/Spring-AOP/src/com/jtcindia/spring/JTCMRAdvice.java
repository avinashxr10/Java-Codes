package com.jtcindia.spring;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class JTCMRAdvice implements ThrowsAdvice {

	@Autowired
	LogService ls = null;

	@Autowired
	TxService tx = null;

	public void afterThrowing(Exception e) {
		tx.rollback();
		ls.logThrowing(e);
	}

}
