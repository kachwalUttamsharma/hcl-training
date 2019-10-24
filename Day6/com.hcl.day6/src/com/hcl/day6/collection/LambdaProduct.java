<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaProduct {
	public static void main(String[] args) {
		List <Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"Hp Laptop", 25000));
		list.add(new Product(2,"Keyboard", 500));
		list.add(new Product(3,"Dell Mouse", 150));
		
		Collections.sort(list, (p1,p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Product pro : list){
			System.out.println(pro);
		}
		
		Collections.sort(list, (p1,p2)->{
			return (int) (p1.price-p2.price);
		});
		System.out.println("----Sort by price----");
		
		for (Product pro : list){
			System.out.println(pro);
		}
		
		
	}
}
=======
package com.hcl.day6.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaProduct {
	public static void main(String[] args) {
		List <Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"Hp Laptop", 25000));
		list.add(new Product(2,"Keyboard", 500));
		list.add(new Product(3,"Dell Mouse", 150));
		
		Collections.sort(list, (p1,p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Product pro : list){
			System.out.println(pro);
		}
		
		Collections.sort(list, (p1,p2)->{
			return (int) (p1.price-p2.price);
		});
		System.out.println("----Sort by price----");
		
		for (Product pro : list){
			System.out.println(pro);
		}
		
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
