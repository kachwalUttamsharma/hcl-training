<<<<<<< HEAD
package com.hcl.abs;

abstract class Employ {
	int empn;
	String name;
	double basic;

	public Employ(int empn, String name, double basic) {
		super();
		this.empn = empn;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empn=" + empn + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Janani extends Employ {

	public Janani(int empn, String name, double basic) {
		super(empn, name, basic);
	}
}

class Raghu extends Employ {

	public Raghu(int empn, String name, double basic) {
		super(empn, name, basic);
	}
}

public class AbsCon {
	public static void main(String[] args) {
		Employ obj1 = new Janani(1,"janani",38475);
		Employ obj2 = new Raghu(3,"Raghu",73474);
		
		Employ[] arr = new Employ[]{obj1,obj2};
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
=======
package com.hcl.abs;

abstract class Employ {
	int empn;
	String name;
	double basic;

	public Employ(int empn, String name, double basic) {
		super();
		this.empn = empn;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empn=" + empn + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Janani extends Employ {

	public Janani(int empn, String name, double basic) {
		super(empn, name, basic);
	}
}

class Raghu extends Employ {

	public Raghu(int empn, String name, double basic) {
		super(empn, name, basic);
	}
}

public class AbsCon {
	public static void main(String[] args) {
		Employ obj1 = new Janani(1,"janani",38475);
		Employ obj2 = new Raghu(3,"Raghu",73474);
		
		Employ[] arr = new Employ[]{obj1,obj2};
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
