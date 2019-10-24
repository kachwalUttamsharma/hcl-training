<<<<<<< HEAD
package com.hcl.java;

public class FactNew {
	
	public void calc(int n){
		int f=1;
		for(int i=n;i>1;i--){
			f=f*i;
		}
		System.out.println("Factorial  = "+f);
	}
	public static void main(String[] args) {
		int n = 2;
		new FactNew().calc(n);
	}

}
=======
package com.hcl.java;

public class FactNew {
	
	public void calc(int n){
		int f=1;
		for(int i=n;i>1;i--){
			f=f*i;
		}
		System.out.println("Factorial  = "+f);
	}
	public static void main(String[] args) {
		int n = 2;
		new FactNew().calc(n);
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
