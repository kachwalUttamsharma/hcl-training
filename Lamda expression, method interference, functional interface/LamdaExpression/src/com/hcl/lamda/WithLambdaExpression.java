package com.hcl.lamda;

public class WithLambdaExpression {
 public static void main(String[] args) {
	MyInterfaceWithReturn myinterface1 = (var1,var2) -> (var1+var2);
	int result1 = myinterface1.addTwoNumbers(10,20);
	System.out.println(result1);
	
	MyInterfaceWithReturn myInterface2= (var1, var2) -> {return(var1+var2);};
	int result2 = myInterface2.addTwoNumbers(30, 40);
	System.out.println(result2);
}
}
