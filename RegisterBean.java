package com.dsrc.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmpMag")
public class RegisterBean 
{
	@Column(name="name")
	private String name;
	@Id
	@Column(name="user")
	private int user;
	@Column(name="pass")
	private String pass;
	@Column(name="age")
	private int age;
	@Column(name="no")
	private String no;
	@Column(name="city")
	private String city;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "RegisterBean [name=" + name + ", user=" + user + ", pass=" + pass + ", age=" + age + ", no=" + no
				+ ", city=" + city + "]";
	}
		
}