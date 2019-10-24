package com.hcl.CollegeProject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CourseList")
public class Courselist {
 private int courseno;
 private int duration;
 private Date startdate;
 private Date enddate;
 private String HOD;
 
 @Id
 @Column (name="Courseno")
public int getCourseno() {
	return courseno;
}
public void setCourseno(int courseno) {
	this.courseno = courseno;
}

@Column (name="duration")
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}

@Column (name="startdate")
public Date getStartdate() {
	return startdate;
}
public void setStartdate(Date startdate) {
	this.startdate = startdate;
}

@Column (name="enddate")
public Date getEnddate() {
	return enddate;
}
public void setEnddate(Date enddate) {
	this.enddate = enddate;
}

@Column (name="HOD")
public String getHOD() {
	return HOD;
}
public void setHOD(String hOD) {
	HOD = hOD;
}
 
 
}
