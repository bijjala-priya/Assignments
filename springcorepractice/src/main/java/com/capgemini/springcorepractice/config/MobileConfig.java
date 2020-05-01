package com.capgemini.springcorepractice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcorepractice.bean.Battery;
import com.capgemini.springcorepractice.bean.Hello;
import com.capgemini.springcorepractice.bean.Sim;
@Configuration
public class MobileConfig {
	
	
	@Bean
	@Scope("prototype")
	public Hello getHello() {
		Hello hello=new Hello();
		hello.setId(1);
		hello.setName("priya");
		return hello;
		
	}
	@Bean
	@Primary
	public Sim getSim() {
		Sim sim=new Sim();
		sim.setNoOfSims(2);
		sim.airtel();
		sim.vodafone();
		return sim;
		
	}
	@Bean
	public Battery getBattery() {
		Battery battery=new Battery();
		battery.setBatteryCapacity(2000);
		battery.airtel();
		battery.vodafone();
		return battery;
	}
	

}
