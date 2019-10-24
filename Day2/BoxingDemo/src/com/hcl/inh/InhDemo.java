<<<<<<< HEAD
package com.hcl.inh;


	
	class c1{
		public void show(){
			System.out.println("From show ..");
		}
	}
	class c2 extends c1{
		public void display(){
			System.out.println("From Display...");
		}
	}
	public class InhDemo {
	public static void main(String[] args) {
		c2 obj = new c2();
		obj.display();
		obj.show();

	}

}
=======
package com.hcl.inh;


	
	class c1{
		public void show(){
			System.out.println("From show ..");
		}
	}
	class c2 extends c1{
		public void display(){
			System.out.println("From Display...");
		}
	}
	public class InhDemo {
	public static void main(String[] args) {
		c2 obj = new c2();
		obj.display();
		obj.show();

	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
// We cannot extend the wrapper class as they are fixed 