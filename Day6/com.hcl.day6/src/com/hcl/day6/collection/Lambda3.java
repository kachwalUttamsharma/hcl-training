<<<<<<< HEAD
package com.hcl.day6.collection;

@FunctionalInterface
interface ICtoF{
	double calc(double c);
}

public class Lambda3 {
	public static void main(String[] args) {
		ICtoF c1 = (c) -> {
			double f = ((9*c)/5)+32;
			return f;
		};
		
		ICtoF k1 = (c)->{
			double k = c+273;
			return k;
		};
		System.out.println(c1.calc(37));
		System.out.println(k1.calc(65));
	}
	
}
=======
package com.hcl.day6.collection;

@FunctionalInterface
interface ICtoF{
	double calc(double c);
}

public class Lambda3 {
	public static void main(String[] args) {
		ICtoF c1 = (c) -> {
			double f = ((9*c)/5)+32;
			return f;
		};
		
		ICtoF k1 = (c)->{
			double k = c+273;
			return k;
		};
		System.out.println(c1.calc(37));
		System.out.println(k1.calc(65));
	}
	
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
