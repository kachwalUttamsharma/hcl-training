<<<<<<< HEAD
package com.hcl.Boxing;

public class OverLoadDemo {
	public void show(int x){
		System.out.println("Show method wrt Int "+x);
	}
	public void show(String x){
		System.out.println("Show method wrt String "+x);
	}
	public void show(boolean x){
		System.out.println("Show method wrt Boolean "+x);
	}
	public void show(double x){
		System.out.println("Show method wrt Double "+x);
	}
	public static void main(String[] args) {
		OverLoadDemo obj = new OverLoadDemo();
		obj.show(true);
		obj.show(12.5);
		obj.show(78);
		obj.show("hello");
		
	}
}
=======
package com.hcl.Boxing;

public class OverLoadDemo {
	public void show(int x){
		System.out.println("Show method wrt Int "+x);
	}
	public void show(String x){
		System.out.println("Show method wrt String "+x);
	}
	public void show(boolean x){
		System.out.println("Show method wrt Boolean "+x);
	}
	public void show(double x){
		System.out.println("Show method wrt Double "+x);
	}
	public static void main(String[] args) {
		OverLoadDemo obj = new OverLoadDemo();
		obj.show(true);
		obj.show(12.5);
		obj.show(78);
		obj.show("hello");
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
