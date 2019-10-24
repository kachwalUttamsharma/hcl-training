<<<<<<< HEAD
package com.hcl.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("wire.xml");
		Faculty f=(Faculty)ctx.getBean("faculty");
		f.teaching();
	}
}
=======
package com.hcl.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("wire.xml");
		Faculty f=(Faculty)ctx.getBean("faculty");
		f.teaching();
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
