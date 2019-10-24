<<<<<<< HEAD
package com.hcl.Boxing;

public class ConTest {
	int a,b;

	public ConTest() {
		super();
		// TODO Auto-generated constructor stub
		this.a=12;
		this.b=13;
		
	}

	public ConTest(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "ConTest [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		ConTest obj = new ConTest();
		System.out.println(obj);
		ConTest obj2 = new ConTest(12, 987);
		System.out.println(obj2);
	}
	
}
=======
package com.hcl.Boxing;

public class ConTest {
	int a,b;

	public ConTest() {
		super();
		// TODO Auto-generated constructor stub
		this.a=12;
		this.b=13;
		
	}

	public ConTest(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "ConTest [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		ConTest obj = new ConTest();
		System.out.println(obj);
		ConTest obj2 = new ConTest(12, 987);
		System.out.println(obj2);
	}
	
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
