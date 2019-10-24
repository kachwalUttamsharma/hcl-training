package com.hcl.fi;

import java.util.function.Consumer;

public class MyInterfaceMain {
   public static void main(String[] args) {
	MyInterface minterface= (a)-> {System.out.println(a);};
	minterface.someMethod("HCL");
	
	MyInterface minterface1= System.out :: println;
	minterface.someMethod("java CoE");
	
	Consumer<String> consumer = System.out :: println;
	consumer.accept("bye");
}
}
