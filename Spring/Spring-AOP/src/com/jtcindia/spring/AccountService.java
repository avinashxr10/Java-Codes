package com.jtcindia.spring;

public class AccountService {

	public void getBal() {
		System.out.println("getBal-begin");
		System.out.println("getBal-done");
		System.out.println("getBal-end");
	}

	public void myDeposite() {
		System.out.println("deposit-begin");
		System.out.println("deposit-done");
		System.out.println("deposit-end");
	}

	public void myWithdraw() throws Exception {
		System.out.println("withdraw-begin");
		if (1 == 1) {
			throw new InsufficientFundsException();
		}
		System.out.println("withdraw-end");
	}
}
