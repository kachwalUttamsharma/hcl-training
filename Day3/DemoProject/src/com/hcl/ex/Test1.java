<<<<<<< HEAD
package com.hcl.ex;

public class Test1 {

	public static void main(String[] args) {
		int[] a= new int[]{12,5,3};
		try{
			a[6] = 5/0;    ////Right to left
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Size small");
		}catch(ArithmeticException e){
			System.out.println("Division by zero");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
=======
package com.hcl.ex;

public class Test1 {

	public static void main(String[] args) {
		int[] a= new int[]{12,5,3};
		try{
			a[6] = 5/0;    ////Right to left
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Size small");
		}catch(ArithmeticException e){
			System.out.println("Division by zero");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
