package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonInfo1;

public class PropertiesFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		PersonInfo1 info=ctx.getBean("pinfo1",PersonInfo1.class);
		System.out.println(info);
		
		Environment env=ctx.getEnvironment();
		System.out.println("OS.NAME::"+env.getProperty("os.name"));
		System.out.println("Person.NAME::"+env.getProperty("per.name"));
	}

}
