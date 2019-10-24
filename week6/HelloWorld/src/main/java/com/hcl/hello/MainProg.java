<<<<<<< HEAD
package com.hcl.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Hello.xml");
		Hello h=(Hello)ctx.getBean("bean1");
		System.out.println(h.sayHello("Laksh"));
	}
}
=======
package com.hcl.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Hello.xml");
		Hello h=(Hello)ctx.getBean("bean1");
		System.out.println(h.sayHello("Laksh"));
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
