<<<<<<< HEAD
package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		//Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet s = new TreeSet(c);
		s.add(new Employ(1,"Hema",545234));
		s.add(new Employ(2,"Rema",376782));
		s.add(new Employ(3,"garr",923767));
		s.add(new Employ(4,"jaat",123984));
		s.add(new Employ(5,"liit",383940));
		s.add(new Employ(7,"mmmm",984628));
		System.out.println("Sorted Data");
		s.forEach(System.out::println);
		
	}
}
=======
package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		//Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet s = new TreeSet(c);
		s.add(new Employ(1,"Hema",545234));
		s.add(new Employ(2,"Rema",376782));
		s.add(new Employ(3,"garr",923767));
		s.add(new Employ(4,"jaat",123984));
		s.add(new Employ(5,"liit",383940));
		s.add(new Employ(7,"mmmm",984628));
		System.out.println("Sorted Data");
		s.forEach(System.out::println);
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
