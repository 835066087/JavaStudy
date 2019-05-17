package com.atguigu.cms.domain;

public class Customer {

	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Customer() {
		
	}
	
	public Customer(String name, char gender, int age, String phone, String email) {
		this.age = age ;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		
	}
	
	

	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String say() {
		String str = name + "\t"+ gender + "\t" + age + "\t" + phone +"\t" + email;
		return str;
	}

	

}
