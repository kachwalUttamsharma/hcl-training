<<<<<<< HEAD
package com.hcl.Boxing;

public class BoxEmploy {
	
	public void show(Object ob){
		Employ e = new Employ();
		System.out.println(e);
	}

	public static void main(String[] args) {
		Employ objEmploy = new Employ();
		objEmploy.empno=1;
		objEmploy.name = "Nagendra";
		objEmploy.basic=45446;
		
		new BoxEmploy().show(objEmploy);
	}

}
=======
package com.hcl.Boxing;

public class BoxEmploy {
	
	public void show(Object ob){
		Employ e = new Employ();
		System.out.println(e);
	}

	public static void main(String[] args) {
		Employ objEmploy = new Employ();
		objEmploy.empno=1;
		objEmploy.name = "Nagendra";
		objEmploy.basic=45446;
		
		new BoxEmploy().show(objEmploy);
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
