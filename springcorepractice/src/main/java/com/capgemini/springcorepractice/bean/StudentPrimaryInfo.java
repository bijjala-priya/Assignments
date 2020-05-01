package com.capgemini.springcorepractice.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentPrimaryInfo {
	private int id;
	private String name;
	private String email;
	private StudentSecondaryInfo secondaryinfo;
	
	public StudentPrimaryInfo() {
		System.out.println("Default constructor of Student Primary");
	}
	
	public StudentPrimaryInfo(int id,String name,String email,StudentSecondaryInfo secondaryinfo) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.secondaryinfo=secondaryinfo;
	}
	public void show() {
		System.out.println("id----->"+id);
		System.out.println("name----->"+name);
		System.out.println("email----->"+email);
		secondaryinfo.print();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public StudentSecondaryInfo getSecondaryinfo() {
		return secondaryinfo;
	}

	public void setSecondaryinfo(StudentSecondaryInfo secondaryinfo) {
		this.secondaryinfo = secondaryinfo;
	}

	
	 @PostConstruct
		public void init() throws Exception{
			System.out.println("Init Method");
		}
	    @PreDestroy
		public void destroy() throws Exception{
			System.out.println("close the destroy");
		}

}
