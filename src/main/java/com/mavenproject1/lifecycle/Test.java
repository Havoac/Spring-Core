package com.mavenproject1.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;		
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mavenproject1/lifecycle/lifecycle_config.xml");
	
		Samosa s1 = (Samosa)context.getBean("s1");
		System.out.println(s1);
		
		context.registerShutdownHook();		// use to destroy method (to destroy method)
	}

}