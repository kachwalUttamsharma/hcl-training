<<<<<<< HEAD
package com.hcl.ex;

class Employ{
	String name;

	public Employ(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
}

class JavaEmploy extends Employ{

	public JavaEmploy(String name) {
		super(name);
	}
	
}

class HrEmploy extends Employ{

	public HrEmploy(String name) {
		super(name);
	}
}


public class Quizzz {
	public static void main(String[] args) {
		Employ[] arrEmploy = new Employ[]
				{
						new HrEmploy("Sagar"),
						new JavaEmploy("Nivedita"),
						new HrEmploy("laksh"),
						new JavaEmploy("Ntina"),
						new HrEmploy("bull"),
						new JavaEmploy("david"),
						new HrEmploy("hluy"),
						new JavaEmploy("racer"),
						new HrEmploy("garry"),
						new JavaEmploy("Namir"),
				};
		
		System.out.println();
		for (Employ employ : arrEmploy){
			if(employ instanceof JavaEmploy){
				System.out.println(employ);
			}
		}
	}

}
=======
package com.hcl.ex;

class Employ{
	String name;

	public Employ(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
}

class JavaEmploy extends Employ{

	public JavaEmploy(String name) {
		super(name);
	}
	
}

class HrEmploy extends Employ{

	public HrEmploy(String name) {
		super(name);
	}
}


public class Quizzz {
	public static void main(String[] args) {
		Employ[] arrEmploy = new Employ[]
				{
						new HrEmploy("Sagar"),
						new JavaEmploy("Nivedita"),
						new HrEmploy("laksh"),
						new JavaEmploy("Ntina"),
						new HrEmploy("bull"),
						new JavaEmploy("david"),
						new HrEmploy("hluy"),
						new JavaEmploy("racer"),
						new HrEmploy("garry"),
						new JavaEmploy("Namir"),
				};
		
		System.out.println();
		for (Employ employ : arrEmploy){
			if(employ instanceof JavaEmploy){
				System.out.println(employ);
			}
		}
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
