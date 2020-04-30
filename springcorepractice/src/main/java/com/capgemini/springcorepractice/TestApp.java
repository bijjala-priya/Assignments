package com.capgemini.springcorepractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcorepractice.bean.StudentPrimaryInfo;

public class TestApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("mobile.xml");
		StudentPrimaryInfo info=context.getBean(StudentPrimaryInfo.class);
		info.show();
		context.close();

	}

}
