package com.nt.test;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=BikeFactory.orderBike("electric");
		bike.drive();
	}

}
