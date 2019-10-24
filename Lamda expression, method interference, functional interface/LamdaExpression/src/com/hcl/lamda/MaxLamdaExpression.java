package com.hcl.lamda;

public class MaxLamdaExpression {
public static void main(String[] args) {
	Max mymax=(var1,var2)->{int max=var1>var2?var1:var2;return max;};
	int m1=mymax.myMax(10, 20);
	System.out.println(m1);
}
}
