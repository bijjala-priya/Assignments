package com.capgemini.springcorepractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcorepractice.bean.Hello;
import com.capgemini.springcorepractice.config.MobileConfig;

public class TestAnnotation {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MobileConfig.class);
	    Hello hello=context.getBean(Hello.class);
	    hello.display();
	    context.close();
	
	
	}

}
