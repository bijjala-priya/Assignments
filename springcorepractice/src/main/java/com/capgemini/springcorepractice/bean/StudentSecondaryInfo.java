package com.capgemini.springcorepractice.bean;

public class StudentSecondaryInfo {
	private String city;
	private String addresstype;
	
	public  StudentSecondaryInfo() {
		System.out.println("Default constructor of Student Secodary Info");
	}
	
	public  StudentSecondaryInfo(String city,String addresstype) {
		this.city=city;
		this.addresstype=addresstype;
	}
	public void print() {
		System.out.println("city---->"+city);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddresstype() {
		return addresstype;
	}

	public void setAddresstype(String addresstype) {
		this.addresstype = addresstype;
	}

}
