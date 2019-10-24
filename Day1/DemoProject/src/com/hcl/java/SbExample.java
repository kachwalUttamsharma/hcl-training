<<<<<<< HEAD
package com.hcl.java;

public class SbExample {
	
	public void show(int age, String name, String course, String city){
		
		StringBuilder sbError  = new StringBuilder();
		boolean isValid =true;
		if(age<=20){
			sbError.append("Age must be greater than 20"+"\r\n");
			isValid = false;
		}
		if(name.indexOf(' ')== -1){
			sbError.append("Name contains both First and Last Name"+"\r\n");
			isValid = false;
		}
		if(!course.equalsIgnoreCase("JAVA")){
			sbError.append("Only Java course Allowed..."+"/r/n");
			isValid = false;
		}
		if(isValid == true){
		System.out.println("Age "+age);
		System.out.println("Name "+name);
		System.out.println("Course "+course);
		System.out.println("city "+city);
		}
		else{
			System.out.println(sbError);
		}
	}
	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age =21;
		name = "Ram";
		course = "Ja";
		city="Delhi";
		new SbExample().show(age, name, course, city);
	}

}
=======
package com.hcl.java;

public class SbExample {
	
	public void show(int age, String name, String course, String city){
		
		StringBuilder sbError  = new StringBuilder();
		boolean isValid =true;
		if(age<=20){
			sbError.append("Age must be greater than 20"+"\r\n");
			isValid = false;
		}
		if(name.indexOf(' ')== -1){
			sbError.append("Name contains both First and Last Name"+"\r\n");
			isValid = false;
		}
		if(!course.equalsIgnoreCase("JAVA")){
			sbError.append("Only Java course Allowed..."+"/r/n");
			isValid = false;
		}
		if(isValid == true){
		System.out.println("Age "+age);
		System.out.println("Name "+name);
		System.out.println("Course "+course);
		System.out.println("city "+city);
		}
		else{
			System.out.println(sbError);
		}
	}
	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age =21;
		name = "Ram";
		course = "Ja";
		city="Delhi";
		new SbExample().show(age, name, course, city);
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
