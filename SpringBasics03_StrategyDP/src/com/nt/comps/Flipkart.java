package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("fpkt")
public class Flipkart {
	
	@Autowired
	private Courier courier;
	
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
