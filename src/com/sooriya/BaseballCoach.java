package com.sooriya;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice batting for daily 30 mins";
	}
	public BaseballCoach()
	{
		System.out.println("Inside default constructor");
	}
	@PostConstruct
    public void initmethod()
    {
    	System.out.println("Inside init method");
    }
	@PreDestroy
	public void destroymethod()
	{
		System.out.println("Inside destroy method");
	}
}
