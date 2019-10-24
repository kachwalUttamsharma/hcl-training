<<<<<<< HEAD
package com.hcl.day3;

public class Attendance {

	public static void display (Object...ob){
		for(Object object : ob){
			System.out.println(object + " ");
		}
		System.out.println();
	}
	public static void show(int day,String...name){
		System.out.println(day + " ");
	for(String s : name){
		System.out.print(s +  " ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		show(1);
		show(2,"Visalakshmi","prem");
		show(3,"vish","daas","dburi","hummm");
		show(4,"laksh");
		
		display();
		display("lakshay",12,true,6.78);
	}
=======
package com.hcl.day3;

public class Attendance {

	public static void display (Object...ob){
		for(Object object : ob){
			System.out.println(object + " ");
		}
		System.out.println();
	}
	public static void show(int day,String...name){
		System.out.println(day + " ");
	for(String s : name){
		System.out.print(s +  " ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		show(1);
		show(2,"Visalakshmi","prem");
		show(3,"vish","daas","dburi","hummm");
		show(4,"laksh");
		
		display();
		display("lakshay",12,true,6.78);
	}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
}