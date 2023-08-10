package com.hefshine.spring_demo.whyspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
	
	public static void main(String[] args) {
		//Vodafone vodafone=new Vodafone();
		//vodafone.calling();
		//Sim sim=new Vodafone();
		//sim.calling();
		
		//1.Bean factory  2. Application context
		//IOC-inversion of control
		
		ApplicationContext applicationContext=new 
				ClassPathXmlApplicationContext("configration.xml");
		
		Sim sim=(Sim)applicationContext.getBean("sim");
		
		sim.calling();
		
		
	}

}
