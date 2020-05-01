package com.capgemini.springcorepractice.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	private int id;
	private String name;
	private long mobileNumber;
	@Autowired
	@Qualifier("getSim")
	private Mobile mobile;
	
	public Hello() {
		System.out.println("Default Constructor");
	}
	
	public Hello(int id,String name,long mobileNumber,Mobile mobile) {
		this.id=id;
		this.name=name;
		this.mobile=mobile;
	}
	public void display() {
		System.out.println("Id---->"+id);
		System.out.println("Name---->"+name);
		System.out.println("Mobile Number---->"+mobileNumber);
		mobile.airtel();
		mobile.vodafone();
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}
	

}
