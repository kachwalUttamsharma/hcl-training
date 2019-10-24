<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.List;
import java.util.ArrayList;

public class GenListInt {

	public static void main(String[] args) {
		List<Integer> lstData = new ArrayList<Integer>();
		lstData.add(23);
		lstData.add(new Integer(03));
		lstData.add(new Integer(63));
		lstData.add(new Integer(65));
		lstData.add(new Integer(97));
		int sum = 0;
		for (Integer i : lstData) {
			sum+=i;
		}
		System.out.println("Sum is " +sum);
	}
}
=======
package com.hcl.day6.collection;

import java.util.List;
import java.util.ArrayList;

public class GenListInt {

	public static void main(String[] args) {
		List<Integer> lstData = new ArrayList<Integer>();
		lstData.add(23);
		lstData.add(new Integer(03));
		lstData.add(new Integer(63));
		lstData.add(new Integer(65));
		lstData.add(new Integer(97));
		int sum = 0;
		for (Integer i : lstData) {
			sum+=i;
		}
		System.out.println("Sum is " +sum);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
