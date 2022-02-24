package com.jtcindia.spring;

public class Batch {
	String bid;
	String sp;
	String timing;
	int nos;

	public Batch(String bid, String sp, String timimg, int nos) {
		this.bid = bid;
		this.sp = sp;
		this.timing = timimg;
		this.nos = nos;
	}

	@Override
	public String toString() {
		String msg = "JTC annotation New Batch";
		msg = msg+"\nBatch ID"+bid;
		msg = msg+"\nstart date"+sp;
		msg = msg+"\ntiming"+timing;
		msg = msg+"\nNo of seats"+nos;
		return msg;
	}
	
	
}
