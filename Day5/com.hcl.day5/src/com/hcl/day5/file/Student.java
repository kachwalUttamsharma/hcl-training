<<<<<<< HEAD
package com.hcl.day5.file;

import java.io.Serializable;

public class Student implements Serializable {

	int sno;
	String name;
	String city;
	transient double cgp;
	public Student(int sno, String name, String city, double cgp) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	
	
}
=======
package com.hcl.day5.file;

import java.io.Serializable;

public class Student implements Serializable {

	int sno;
	String name;
	String city;
	transient double cgp;
	public Student(int sno, String name, String city, double cgp) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	
	
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
