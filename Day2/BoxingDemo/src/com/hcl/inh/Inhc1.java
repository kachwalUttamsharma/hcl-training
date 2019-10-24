<<<<<<< HEAD
package com.hcl.inh;

public class Inhc1 {

	
		public static void main(String[] args) {
			new Second1();
	}

}
class First1{
	static{System.out.println("base static");}
	
	public First1(){
		 System.out.println("base class const.");
	 }
}
class Second1 extends First1{
	static{
		System.out.println("Derived class static");
	}
	public Second1(){
		 System.out.println("Derived class const..");
	 }
}
=======
package com.hcl.inh;

public class Inhc1 {

	
		public static void main(String[] args) {
			new Second1();
	}

}
class First1{
	static{System.out.println("base static");}
	
	public First1(){
		 System.out.println("base class const.");
	 }
}
class Second1 extends First1{
	static{
		System.out.println("Derived class static");
	}
	public Second1(){
		 System.out.println("Derived class const..");
	 }
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
