<<<<<<< HEAD
package com.hcl.Boxing;

public class Employ {
	int empno;
	String name;
	double basic;
	
	@Override
	public boolean equals(Object obj) {
		
		Employ e = (Employ) obj;
		if(e.basic == basic){
			return true;
		}else{
				return false;
			}
					
		}
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	
}
=======
package com.hcl.Boxing;

public class Employ {
	int empno;
	String name;
	double basic;
	
	@Override
	public boolean equals(Object obj) {
		
		Employ e = (Employ) obj;
		if(e.basic == basic){
			return true;
		}else{
				return false;
			}
					
		}
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
