package com.nt.main;

import java.time.LocalTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class AutowiringTest {

	public static void main(String[] args) {
		Class c1=AppConfig.class;
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(c1);
		//WishMessageGenerator wmg=ctx.getBean("wmg",WishMessageGenerator.class);
		//LocalTime time=ctx.getBean("itime",LocalTime.class);
		Class<WishMessageGenerator> c2=WishMessageGenerator.class;
		WishMessageGenerator wmg=ctx.getBean("wmg",c2);
		System.out.println(c2.getName()+"......"+c2.getSuperclass().getName()+"...."+c2.getPackageName());
		String msg=wmg.generateMessage("varun");
		System.out.println(msg);
		ctx.close();
	}

}
