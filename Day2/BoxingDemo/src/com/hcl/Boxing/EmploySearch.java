<<<<<<< HEAD
package com.hcl.Boxing;

public class EmploySearch {
	
	public Employ showEmploy(int emp){
		Employ e = null;
		if(emp==1){
			e = new Employ();
			e.empno = 100;
			e.name = "Adi";
			e.basic = 21542;
		}
		if(emp==3){
			e = new Employ();
			e.empno = 170;
			e.name = "Aditya";
			e.basic = 29772;
	}
		return e;
		
	}
	public static void main(String[] args) {
		EmploySearch obj = new EmploySearch();
		Employ res = obj.showEmploy(1);
		if(res!=null){
			System.out.println(res);
		}
		else{
			System.out.println("Emp not found");
		}

	}
	
	}

=======
package com.hcl.Boxing;

public class EmploySearch {
	
	public Employ showEmploy(int emp){
		Employ e = null;
		if(emp==1){
			e = new Employ();
			e.empno = 100;
			e.name = "Adi";
			e.basic = 21542;
		}
		if(emp==3){
			e = new Employ();
			e.empno = 170;
			e.name = "Aditya";
			e.basic = 29772;
	}
		return e;
		
	}
	public static void main(String[] args) {
		EmploySearch obj = new EmploySearch();
		Employ res = obj.showEmploy(1);
		if(res!=null){
			System.out.println(res);
		}
		else{
			System.out.println("Emp not found");
		}

	}
	
	}

>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
