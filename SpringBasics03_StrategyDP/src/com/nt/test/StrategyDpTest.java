package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		String resultMsg=fpkt.shopping(new String[] {"Shirt","trouser", "Kurta"},
																new double[] {5000.0,6000.0,7000.0});
		System.out.println(resultMsg);
																
	}

}
