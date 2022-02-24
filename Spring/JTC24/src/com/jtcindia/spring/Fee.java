package com.jtcindia.spring;

public class Fee {
	double totalfee;
	double feepaid;
	double feebal;

	public Fee(double totalfee, double feepaid, double feebal) {

		this.totalfee = totalfee;
		this.feepaid = feepaid;
		this.feebal = feebal;
	}

	public double getTotalfee() {
		return totalfee;
	}

	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}

	public double getFeepaid() {
		return feepaid;
	}

	public void setFeepaid(double feepaid) {
		this.feepaid = feepaid;
	}

	public double getFeebal() {
		return feebal;
	}

	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}

}
