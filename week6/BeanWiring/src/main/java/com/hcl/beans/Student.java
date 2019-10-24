<<<<<<< HEAD
package com.hcl.beans;

public class Student {
	
	private int sno;
	private String name;
	private LunchBox lunchbox;
	
	public LunchBox getLunchbox() {
		return lunchbox;
	}
	public void setLunchbox(LunchBox lunchbox) {
		this.lunchbox = lunchbox;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("Sno "+sno+" Name"+name);
		lunchbox.eat();
	}
}
=======
package com.hcl.beans;

public class Student {
	
	private int sno;
	private String name;
	private LunchBox lunchbox;
	
	public LunchBox getLunchbox() {
		return lunchbox;
	}
	public void setLunchbox(LunchBox lunchbox) {
		this.lunchbox = lunchbox;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("Sno "+sno+" Name"+name);
		lunchbox.eat();
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
