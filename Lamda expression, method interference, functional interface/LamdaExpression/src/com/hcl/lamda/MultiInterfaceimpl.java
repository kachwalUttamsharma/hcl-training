package com.hcl.lamda;

public class MultiInterfaceimpl {

	public static void main(String[] args) {
       String name="uttam";
		MultiInterface m= (String name1)-> {System.out.println(name);
		return name1;};
		m.sayHello(name);
	System.out.println(MultiInterface.add(10, 20));
	
	System.out.println(m.defaultMethod(20));
	
	//MultiInterface myinterface1=(name1) ->(name);
	System.out.println(m.sayHello(name).equals("uttam"));
	}
}