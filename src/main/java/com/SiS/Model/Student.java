package com.SiS.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	private String city;
	private int age;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	public Student(int sid, String name, String city, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
