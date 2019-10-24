<<<<<<< HEAD
package com.hcl.Boxing;

public class TimeZone {
	int hours, min;

	public TimeZone(int hours, int min) {
		super();
		this.hours = hours;
		this.min = min;
	}
	
	public TimeZone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TimeZone add(TimeZone t1,TimeZone t2){
		TimeZone t3 = new TimeZone();
		t3.hours = t1.hours+t2.hours;
		t3.min = t1.min+t2.min;
		if(t3.min>=60){
			t3.hours++;
			t3.min%=60;
		}
		return t3;
	}

	@Override
	public String toString() {
		return "TimeZone [hours=" + hours + ", min=" + min + "]";
	}
	public static void main(String[] args) {
		TimeZone t1 = new TimeZone(3,40);
		TimeZone t2 = new TimeZone(1,20);
		TimeZone t3 = new TimeZone().add(t1, t2);
		System.out.println(t3);
	}
}
=======
package com.hcl.Boxing;

public class TimeZone {
	int hours, min;

	public TimeZone(int hours, int min) {
		super();
		this.hours = hours;
		this.min = min;
	}
	
	public TimeZone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TimeZone add(TimeZone t1,TimeZone t2){
		TimeZone t3 = new TimeZone();
		t3.hours = t1.hours+t2.hours;
		t3.min = t1.min+t2.min;
		if(t3.min>=60){
			t3.hours++;
			t3.min%=60;
		}
		return t3;
	}

	@Override
	public String toString() {
		return "TimeZone [hours=" + hours + ", min=" + min + "]";
	}
	public static void main(String[] args) {
		TimeZone t1 = new TimeZone(3,40);
		TimeZone t2 = new TimeZone(1,20);
		TimeZone t3 = new TimeZone().add(t1, t2);
		System.out.println(t3);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
