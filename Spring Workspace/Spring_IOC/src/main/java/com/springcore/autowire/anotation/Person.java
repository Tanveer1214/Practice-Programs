package com.springcore.autowire.anotation;

public class Person {
	
	private String name;
	private String address;
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("Constructor..");
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
}
