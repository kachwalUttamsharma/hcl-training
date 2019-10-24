<<<<<<< HEAD
package com.hcl.day3;

class First{
	public void show(){
		System.out.println("First");
	}
}

class Second extends First{
	public void show(){
		//super.show();
		System.out.println("Second");
		
	}
}
public class InhDemo {
	public static void main(String[] args) {
		//Second obj = new Second();
		//obj.show();
		
		//First obj1 = new Second();   ////"new" Hierarchy and hence derived class function
									 //// is invoked.
		//obj1.show();
		
		First ob1 = new First();
		Second ob2 = new Second();
		
		First f1 = (First)ob2;
		f1.show();
		
		First f2 = (Second)ob2;
		f2.show();
		
		Second f3 = (Second)ob1;   ////Runtime error as we can not cast Base to Derived
		f3.show();
	}

}
=======
package com.hcl.day3;

class First{
	public void show(){
		System.out.println("First");
	}
}

class Second extends First{
	public void show(){
		//super.show();
		System.out.println("Second");
		
	}
}
public class InhDemo {
	public static void main(String[] args) {
		//Second obj = new Second();
		//obj.show();
		
		//First obj1 = new Second();   ////"new" Hierarchy and hence derived class function
									 //// is invoked.
		//obj1.show();
		
		First ob1 = new First();
		Second ob2 = new Second();
		
		First f1 = (First)ob2;
		f1.show();
		
		First f2 = (Second)ob2;
		f2.show();
		
		Second f3 = (Second)ob1;   ////Runtime error as we can not cast Base to Derived
		f3.show();
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
