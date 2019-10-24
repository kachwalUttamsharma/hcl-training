<<<<<<< HEAD
package com.hcl.collections;

public class Emp implements Comparable{
int empno;
String name;
double basic;
public Emp(int empno, String name, double basic) {
super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	@Override
	public int compareTo(Object o) {
		Emp e = (Emp)o;
		return name.compareTo(e.name);  ////return e.name.compareTo(name) for reverse
	}
}
=======
package com.hcl.collections;

public class Emp implements Comparable{
int empno;
String name;
double basic;
public Emp(int empno, String name, double basic) {
super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	@Override
	public int compareTo(Object o) {
		Emp e = (Emp)o;
		return name.compareTo(e.name);  ////return e.name.compareTo(name) for reverse
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
