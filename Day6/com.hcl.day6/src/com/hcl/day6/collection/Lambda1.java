<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {

	public static void main(String[] args) {
		List<Integer> lstData = new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(23));
		lstData.add(new Integer(12));
		lstData.add(new Integer(19));
		lstData.add(new Integer(35));
		lstData.forEach(p -> {
			if(p >= 20){
				System.out.println(p);
			}
		});
	}
}
=======
package com.hcl.day6.collection;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {

	public static void main(String[] args) {
		List<Integer> lstData = new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(23));
		lstData.add(new Integer(12));
		lstData.add(new Integer(19));
		lstData.add(new Integer(35));
		lstData.forEach(p -> {
			if(p >= 20){
				System.out.println(p);
			}
		});
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
