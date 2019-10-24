<<<<<<< HEAD
package com.hcl.day6.collection;

@FunctionalInterface
interface IHello{    ///contains only one method
	void sayHello();
}

@FunctionalInterface
interface Icalc{
	int calc(int a,int b);
}



public class Lambda2 {
	public static void main(String[] args) {
		IHello h1 = () ->{
			System.out.println("Hello from Laksh...");
		};
		IHello h2 = () -> {
			System.out.println("Hello from athar...");
		};
		IHello h3 = () -> {
			System.out.println("Hello from me..");
		};
		
		//h1.sayHello();
		//h2.sayHello();
		//h3.sayHello();
		
		IHello[] arr = new IHello[]{h1,h2,h3};
		for(IHello iHello : arr){
			iHello.sayHello();
		}
		
		Icalc ad1 = (a,b) -> {
			System.out.println("Sum ");
			return a+b;
		};
		
		Icalc ad2 = (a,b) -> (a-b);
		Icalc ad3 = (a,b) -> (a*b);
		
		System.out.println(ad1.calc(12, 5));
		System.out.println(ad2.calc(3, 6));
	}
}
=======
package com.hcl.day6.collection;

@FunctionalInterface
interface IHello{    ///contains only one method
	void sayHello();
}

@FunctionalInterface
interface Icalc{
	int calc(int a,int b);
}



public class Lambda2 {
	public static void main(String[] args) {
		IHello h1 = () ->{
			System.out.println("Hello from Laksh...");
		};
		IHello h2 = () -> {
			System.out.println("Hello from athar...");
		};
		IHello h3 = () -> {
			System.out.println("Hello from me..");
		};
		
		//h1.sayHello();
		//h2.sayHello();
		//h3.sayHello();
		
		IHello[] arr = new IHello[]{h1,h2,h3};
		for(IHello iHello : arr){
			iHello.sayHello();
		}
		
		Icalc ad1 = (a,b) -> {
			System.out.println("Sum ");
			return a+b;
		};
		
		Icalc ad2 = (a,b) -> (a-b);
		Icalc ad3 = (a,b) -> (a*b);
		
		System.out.println(ad1.calc(12, 5));
		System.out.println(ad2.calc(3, 6));
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
