<<<<<<< HEAD
package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {

	public static void main(String[] args) {
		List Names = new ArrayList();
		Names.add("Laksh");
		//Names.add(23);
		Names.add("Athar");
		Names.add("Geet");
		Names.add("Aadi");
		Names.add("Master");
		Names.add("System");
		System.out.println("Names are ");
		//for (Object obj1 : Names) {
			//System.out.println(obj1);
		//}
		System.out.println("JDK 1.8 ");
		Names.forEach(System.out::println);
		
		/*Edit*/
		//Updating
		Names.set(2, "Prem Reddy");
		System.out.println("List after updtate");
		Names.forEach(System.out::println);
		
		//Removing
		System.out.println("List after removing by index");
		Names.remove(1);
		Names.forEach(System.out::println);
		
		System.out.println("List after removing by object");
		Names.remove("Laksh");
		Names.forEach(System.out::println);
		System.out.println("TO GET ANY OBJEC OR ELEMENT FROM THE LIST");
		System.out.println(Names.get(3));
		
	}
}
=======
package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {

	public static void main(String[] args) {
		List Names = new ArrayList();
		Names.add("Laksh");
		//Names.add(23);
		Names.add("Athar");
		Names.add("Geet");
		Names.add("Aadi");
		Names.add("Master");
		Names.add("System");
		System.out.println("Names are ");
		//for (Object obj1 : Names) {
			//System.out.println(obj1);
		//}
		System.out.println("JDK 1.8 ");
		Names.forEach(System.out::println);
		
		/*Edit*/
		//Updating
		Names.set(2, "Prem Reddy");
		System.out.println("List after updtate");
		Names.forEach(System.out::println);
		
		//Removing
		System.out.println("List after removing by index");
		Names.remove(1);
		Names.forEach(System.out::println);
		
		System.out.println("List after removing by object");
		Names.remove("Laksh");
		Names.forEach(System.out::println);
		System.out.println("TO GET ANY OBJEC OR ELEMENT FROM THE LIST");
		System.out.println(Names.get(3));
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
