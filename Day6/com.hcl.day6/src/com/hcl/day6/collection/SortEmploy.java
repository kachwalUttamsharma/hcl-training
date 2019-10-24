<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c = new NamGenComprtr();
		Set<Employ> setEmploy = new TreeSet<Employ>(c);
		setEmploy.add(new Employ(1,"Divya",43543));
		setEmploy.add(new Employ(2,"Div",34625));
		setEmploy.add(new Employ(3,"Divay",67897));
		setEmploy.add(new Employ(4,"Diya",28347));
		setEmploy.add(new Employ(5,"ivya",34856));
		System.out.println("Employ List  ");
		setEmploy.forEach(System.out::println);
	}
}
=======
package com.hcl.day6.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c = new NamGenComprtr();
		Set<Employ> setEmploy = new TreeSet<Employ>(c);
		setEmploy.add(new Employ(1,"Divya",43543));
		setEmploy.add(new Employ(2,"Div",34625));
		setEmploy.add(new Employ(3,"Divay",67897));
		setEmploy.add(new Employ(4,"Diya",28347));
		setEmploy.add(new Employ(5,"ivya",34856));
		System.out.println("Employ List  ");
		setEmploy.forEach(System.out::println);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
