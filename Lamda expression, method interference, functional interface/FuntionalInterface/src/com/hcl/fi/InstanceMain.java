package com.hcl.fi;

public class InstanceMain {
 public static void main(String[] args) {
	

	InstanceInterface minterface= () -> {System.out.println("hey man!");};
    minterface.myInterface();
    
    InstanceMethodReference instanceMethodReference= new InstanceMethodReference();
    InstanceInterface instanceInterface1= instanceMethodReference::saySomething;
    instanceMethodReference.saySomething();
    instanceInterface1.myInterface();
}
}