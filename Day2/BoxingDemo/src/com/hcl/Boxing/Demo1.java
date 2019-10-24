<<<<<<< HEAD
package com.hcl.Boxing;

public class Demo1 {
	
	public int sum(){
		return 5;
	}
	public int sum(int x){
		return x+5;
	}
	public int sum(int x,int y){
		return x+y;
	}
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		int res = obj.sum();
		System.out.println("Sum is "+res);
		 res = obj.sum(78);
		System.out.println("Sum is "+res);
		res = obj.sum(77,34);
		System.out.println("Sum is "+res);
	}

}
=======
package com.hcl.Boxing;

public class Demo1 {
	
	public int sum(){
		return 5;
	}
	public int sum(int x){
		return x+5;
	}
	public int sum(int x,int y){
		return x+y;
	}
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		int res = obj.sum();
		System.out.println("Sum is "+res);
		 res = obj.sum(78);
		System.out.println("Sum is "+res);
		res = obj.sum(77,34);
		System.out.println("Sum is "+res);
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
