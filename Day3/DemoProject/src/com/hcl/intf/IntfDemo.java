<<<<<<< HEAD
package com.hcl.intf;

interface ITraining{
	void name();
	void email();
}

class Hema implements ITraining{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Name is Hema");
		
	}

	@Override
	public void email() {
		System.out.println("hemaa@gmail.com");
		
	}
}

class keerthana implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Keerthana");
		
	}

	@Override
	public void email() {
		System.out.println("Keerthana@gmail.com");
		
	}
	
}

public class IntfDemo {
public static void main(String[] args) {
	ITraining[] arr = new ITraining[]
	{
		new Hema(),
		new keerthana()
	};
	for(ITraining iTraining : arr){
		iTraining.name();
		iTraining.email();
	}
}
	
}
=======
package com.hcl.intf;

interface ITraining{
	void name();
	void email();
}

class Hema implements ITraining{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Name is Hema");
		
	}

	@Override
	public void email() {
		System.out.println("hemaa@gmail.com");
		
	}
}

class keerthana implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Keerthana");
		
	}

	@Override
	public void email() {
		System.out.println("Keerthana@gmail.com");
		
	}
	
}

public class IntfDemo {
public static void main(String[] args) {
	ITraining[] arr = new ITraining[]
	{
		new Hema(),
		new keerthana()
	};
	for(ITraining iTraining : arr){
		iTraining.name();
		iTraining.email();
	}
}
	
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
