<<<<<<< HEAD
package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {

	public static void main(String[] args) {
		List num = new ArrayList();
		num.add(new Integer(23));
		num.add(new Integer(24));
		num.add(new Integer(87));
		num.add(new Integer(45));
		num.add(new Integer(67));
		num.add(new Integer(39));
		num.add(new Integer(64));
		int sum = 0;
		for(Object ob : num){
			sum+=(Integer)ob;
		}
		System.out.println("Sum is " +sum);
	}
}
=======
package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {

	public static void main(String[] args) {
		List num = new ArrayList();
		num.add(new Integer(23));
		num.add(new Integer(24));
		num.add(new Integer(87));
		num.add(new Integer(45));
		num.add(new Integer(67));
		num.add(new Integer(39));
		num.add(new Integer(64));
		int sum = 0;
		for(Object ob : num){
			sum+=(Integer)ob;
		}
		System.out.println("Sum is " +sum);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
