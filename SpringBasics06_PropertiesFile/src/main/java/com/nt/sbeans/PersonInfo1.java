package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("pinfo1")
public class PersonInfo1 {
	@Autowired
		private Environment env;
	
	public void showData() {
		System.out.println("OS.NAME::"+env.getProperty("os.name"));
		System.out.println("PerID of Pinfo value::"+env.getProperty("per.id"));
	}
}
