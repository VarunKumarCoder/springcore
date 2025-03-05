package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	
	private Courier courier;

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	
	public String shopping(String items[],double prices[]) {
		double billAmount=0.0;
		for(double p:prices) {
			billAmount=billAmount+p;
		}
		int oid=new Random().nextInt(1000);
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+"Items with Bill Amount:::"+billAmount+"____"+msg;
	}
}
