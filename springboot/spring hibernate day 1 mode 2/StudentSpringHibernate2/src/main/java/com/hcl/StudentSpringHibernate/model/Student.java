package com.hcl.StudentSpringHibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Student {
  private int Rollnum;
  private String Age;
  private String Gender;
  private String Name;
  private String Country;
  private float finalScore;
  private Date dateofjoin;
  
  @Id
  @Column(name="Rollnum")
public int getRollnum() {
	return Rollnum;
}
public void setRollnum(int rollnum) {
	Rollnum = rollnum;
}
@Column(name="Age")
public String getAge() {
	return Age;
}
public void setAge(String age) {
	Age = age;
}
@Column(name="Gender")
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
@Column(name="Name")
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
@Column(name="Country")
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
@Column(name="FinalScore")
public float getFinalScore() {
	return finalScore;
}
public void setFinalScore(float finalScore) {
	this.finalScore = finalScore;
}
@Column(name="DateOfJoin")
public Date getDateofjoin() {
	return dateofjoin;
}
public void setDateofjoin(Date dateofjoin) {
	this.dateofjoin = dateofjoin;
}
  
  
}
