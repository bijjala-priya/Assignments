package com.capgemini.springcorepractice.bean;

public class Battery implements Mobile {
	private int batteryCapacity;

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public void airtel() {
		System.out.println("Airtel Method in Battery class");
		
	}

	@Override
	public void vodafone() {
		System.out.println("Vodafone Method in Battery class");
		
	}

}
