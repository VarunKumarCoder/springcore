package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
@Lazy(true)
public class WishMessageGenerator {
		//has-A property
	private LocalTime lt;
	//has-A property
	private LocalDate ld;
	
	@Autowired
	public void assignTime(LocalTime time) {
		lt=time;
	}

	

	public String generateMessage(String user) {
		int hour=lt.getHour();
		if(hour<12)
			return "GoodMaorning"+user;
		else if(hour <16)
			return "good aft"+user;
		else if(hour <20)
			return "Good eve"+user;
		else
			return "Good Night"+user;
	}
}
