package com.hcl.lamda;

public class WithLambda {
 public static void main(String[] args) {
	MyInterface myinterface=()->{System.out.println("hey buddy");};
	myinterface.sayMessage();
}

}
