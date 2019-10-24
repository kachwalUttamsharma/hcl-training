<<<<<<< HEAD
package com.hcl.intf;

interface Ione{
	void name();
}
interface Itwo{
	void email();
}

class Test implements Ione,Itwo{

	@Override
	public void email() {
		System.out.println("Email hcl@yahoo.com");
	}

	@Override
	public void name() {
		System.out.println("Name is HCL");
	}
	
}

public class MultiInh {

	public static void main(String[] args) {
		Test obj =  new Test();
		obj.name();
		obj.email();
		
	}
}
=======
package com.hcl.intf;

interface Ione{
	void name();
}
interface Itwo{
	void email();
}

class Test implements Ione,Itwo{

	@Override
	public void email() {
		System.out.println("Email hcl@yahoo.com");
	}

	@Override
	public void name() {
		System.out.println("Name is HCL");
	}
	
}

public class MultiInh {

	public static void main(String[] args) {
		Test obj =  new Test();
		obj.name();
		obj.email();
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
