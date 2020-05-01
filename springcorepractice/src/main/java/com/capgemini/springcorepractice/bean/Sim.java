package com.capgemini.springcorepractice.bean;

public class Sim implements Mobile {
	private int noOfSims;

	@Override
	public void airtel() {
		System.out.println("Airtel method");
		
	}

	@Override
	public void vodafone() {
		System.out.println("Vodafone method");
		
	}

	public int getNoOfSims() {
		return noOfSims;
	}

	public void setNoOfSims(int noOfSims) {
		this.noOfSims = noOfSims;
	}

}
