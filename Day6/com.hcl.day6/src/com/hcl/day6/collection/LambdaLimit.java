<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.ArrayList;
import java.util.List;

public class LambdaLimit {

	public static void main(String[] args) {
		List<Integer> lstData = new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(34));
		lstData.add(new Integer(18));
		lstData.add(new Integer(84));
		lstData.add(new Integer(12));
		
		
		lstData.stream().limit(3).forEach(p -> {
		System.out.println(p);	
		});
		System.out.println("After Skipping 2 Records");
		lstData.stream().skip(2).forEach(p -> {
			System.out.println(p);
		});
	}
}
=======
package com.hcl.day6.collection;

import java.util.ArrayList;
import java.util.List;

public class LambdaLimit {

	public static void main(String[] args) {
		List<Integer> lstData = new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(34));
		lstData.add(new Integer(18));
		lstData.add(new Integer(84));
		lstData.add(new Integer(12));
		
		
		lstData.stream().limit(3).forEach(p -> {
		System.out.println(p);	
		});
		System.out.println("After Skipping 2 Records");
		lstData.stream().skip(2).forEach(p -> {
			System.out.println(p);
		});
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
