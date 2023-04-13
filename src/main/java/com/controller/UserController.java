package com.controller;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserController implements InitializingBean,DisposableBean{

	private String name;
	private Integer salary;

	public UserController() {
		System.out.println("UserController() Constructor"); 
	}
	
	public void init() {
		System.out.println("init() of XML");
	}
	
	public void destroyME() {
		System.out.println("destroyME() of XML");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() of Java"); 
		
	}
	
	public void destroy() {
		System.out.println("destroy() of Java");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}
