<<<<<<< HEAD
package com.hcl.abs;

abstract class Animal{
	abstract void name();
	abstract void type();
}

class Lion extends Animal{

	@Override
	void name() {
		System.out.println("Lion is here");
		
	}

	@Override
	void type() {
		System.out.println("Still Lion");
		
	}
	
}

class Crocodile extends Animal{

	@Override
	void name() {
		System.out.println("yes I am Crocodile");
		
	}

	@Override
	void type() {
		System.out.println("Still Crocodile man");
		
	}
	
}
public class AbsTest {
	public static void main(String[] args) {
		
	
	Animal[] arr = new Animal[]{
			new Lion(),
			new Crocodile()	
	};
	for(Animal a : arr){
		a.name();
		a.type();
	
		}
	}
}

=======
package com.hcl.abs;

abstract class Animal{
	abstract void name();
	abstract void type();
}

class Lion extends Animal{

	@Override
	void name() {
		System.out.println("Lion is here");
		
	}

	@Override
	void type() {
		System.out.println("Still Lion");
		
	}
	
}

class Crocodile extends Animal{

	@Override
	void name() {
		System.out.println("yes I am Crocodile");
		
	}

	@Override
	void type() {
		System.out.println("Still Crocodile man");
		
	}
	
}
public class AbsTest {
	public static void main(String[] args) {
		
	
	Animal[] arr = new Animal[]{
			new Lion(),
			new Crocodile()	
	};
	for(Animal a : arr){
		a.name();
		a.type();
	
		}
	}
}

>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
