package com.mavenproject1.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void Start() {
		System.out.println("Starting method - example");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method - example");
	}
}