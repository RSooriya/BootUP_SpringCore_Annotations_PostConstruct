package com.sooriya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

       ClassPathXmlApplicationContext context = new
    		   ClassPathXmlApplicationContext("applicationContext.xml");
       Coach theCoach = context.getBean("baseballCoach",Coach.class);
       System.out.println(theCoach.getDailyWorkout());
       context.close();
	}

}
