<<<<<<< HEAD
package com.hcl.java;

public class CircleDemo {
	
	public void calc(Double radius){
		double area;
		double circ;
		area  = Math.PI*Math.pow(radius, 2);
		circ = 2*Math.PI*radius;
		System.out.println("Area of circle "+ area);
		System.out.println("circumference "+ circ);
	}
	public static void main(String[] args) {
		double radius = 12.5;
		CircleDemo obj = new CircleDemo();
		obj.calc(radius);
	}

}
=======
package com.hcl.java;

public class CircleDemo {
	
	public void calc(Double radius){
		double area;
		double circ;
		area  = Math.PI*Math.pow(radius, 2);
		circ = 2*Math.PI*radius;
		System.out.println("Area of circle "+ area);
		System.out.println("circumference "+ circ);
	}
	public static void main(String[] args) {
		double radius = 12.5;
		CircleDemo obj = new CircleDemo();
		obj.calc(radius);
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
