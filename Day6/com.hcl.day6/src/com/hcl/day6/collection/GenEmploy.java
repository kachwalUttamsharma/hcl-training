<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.List;
import java.util.ArrayList;

public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> lstEmploy = new ArrayList<Employ>();
		lstEmploy.add(new Employ(1,"Divya",43543));
		lstEmploy.add(new Employ(2,"Div",34625));
		lstEmploy.add(new Employ(3,"Divay",67897));
		lstEmploy.add(new Employ(4,"Diya",28347));
		lstEmploy.add(new Employ(5,"ivya",34856));
		System.out.println("Employ List  ");
		lstEmploy.forEach(System.out::println);
		
	}
}
=======
package com.hcl.day6.collection;

import java.util.List;
import java.util.ArrayList;

public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> lstEmploy = new ArrayList<Employ>();
		lstEmploy.add(new Employ(1,"Divya",43543));
		lstEmploy.add(new Employ(2,"Div",34625));
		lstEmploy.add(new Employ(3,"Divay",67897));
		lstEmploy.add(new Employ(4,"Diya",28347));
		lstEmploy.add(new Employ(5,"ivya",34856));
		System.out.println("Employ List  ");
		lstEmploy.forEach(System.out::println);
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
