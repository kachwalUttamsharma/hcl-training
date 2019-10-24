<<<<<<< HEAD
package com.hcl.inh;

public class Modifier {
	protected  int a, b;

	protected void show() {
		a = 10;
		b = 20;
		System.out.println(" a " + a + " b " + b);
	}
	
}

class Hello extends Modifier {
	public void show2() {
		a++;
		b++;
		System.out.println(" a " + a + " b " + b);
	}
	public static void main(String[] args) {
		Hello obj  = new Hello();
		System.out.println(obj.a);
		obj.show();
	}
}
	
=======
package com.hcl.inh;

public class Modifier {
	protected  int a, b;

	protected void show() {
		a = 10;
		b = 20;
		System.out.println(" a " + a + " b " + b);
	}
	
}

class Hello extends Modifier {
	public void show2() {
		a++;
		b++;
		System.out.println(" a " + a + " b " + b);
	}
	public static void main(String[] args) {
		Hello obj  = new Hello();
		System.out.println(obj.a);
		obj.show();
	}
}
	
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
