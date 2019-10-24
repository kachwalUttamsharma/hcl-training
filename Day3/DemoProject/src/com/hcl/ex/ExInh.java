<<<<<<< HEAD
package com.hcl.ex;

class First{
	public void show(){
		System.out.println("First");
	}
}

class Second extends First{
	public void show(){
		System.out.println("Second");
	}
}
public class ExInh {
	public static void main(String[] args) {
		First ob1 = new First();
		//Second ob2;
		try {
			 Second ob2 = (Second)ob1;
			 ob2.show();
		} catch(ClassCastException e){
			System.out.println("nai kro bhai");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
=======
package com.hcl.ex;

class First{
	public void show(){
		System.out.println("First");
	}
}

class Second extends First{
	public void show(){
		System.out.println("Second");
	}
}
public class ExInh {
	public static void main(String[] args) {
		First ob1 = new First();
		//Second ob2;
		try {
			 Second ob2 = (Second)ob1;
			 ob2.show();
		} catch(ClassCastException e){
			System.out.println("nai kro bhai");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
