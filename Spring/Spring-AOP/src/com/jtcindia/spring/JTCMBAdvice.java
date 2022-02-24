package com.jtcindia.spring;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class JTCMBAdvice implements MethodBeforeAdvice {

	@Autowired
	LogService ls = null;

	@Autowired
	TxService ts = null;

	@Autowired
	SecurityService ss = null;

	public void before(MethodBeforeAdvice method, Object[] args, Object target) {

	}
}
