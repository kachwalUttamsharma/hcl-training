<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.ArrayList;
import java.util.List;

public class ListReduceDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		
		
		int sum = lst.stream().reduce(0, (e1,e2) -> e1+e2);
		System.out.println(sum);
	}
}
=======
package com.hcl.day6.collection;

import java.util.ArrayList;
import java.util.List;

public class ListReduceDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		
		
		int sum = lst.stream().reduce(0, (e1,e2) -> e1+e2);
		System.out.println(sum);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
