package com.example.eureka.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class EmployeePersonalInfo {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
  private String name;
  private int age;
  private String street_name;
  private String account_no;
  private String experience;
   
public EmployeePersonalInfo() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeePersonalInfo(Long id, String name, int age, String street_name, String account_no, String experience) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.street_name = street_name;
	this.account_no = account_no;
	this.experience = experience;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getStreet_name() {
	return street_name;
}
public void setStreet_name(String street_name) {
	this.street_name = street_name;
}
public String getAccount_no() {
	return account_no;
}
public void setAccount_no(String account_no) {
	this.account_no = account_no;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}
  
	 
}
