<<<<<<< HEAD
package com.hcl.Boxing;

public class Student {
	int sno;
	String name;
	String city;
	double cgp;
	
	
	@Override
	public boolean equals(Object obj){
		Student other = (Student) obj;
	if(other.sno == sno){
		return true;
	}else {
		return false;
	}
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	
	
}
=======
package com.hcl.Boxing;

public class Student {
	int sno;
	String name;
	String city;
	double cgp;
	
	
	@Override
	public boolean equals(Object obj){
		Student other = (Student) obj;
	if(other.sno == sno){
		return true;
	}else {
		return false;
	}
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	
	
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
