<<<<<<< HEAD
package com.hcl.products;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Wire.xml");
	OrderLogic ol=(OrderLogic)ctx.getBean("orderlogic");
	ol.display();
}
}
=======
package com.hcl.products;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Wire.xml");
	OrderLogic ol=(OrderLogic)ctx.getBean("orderlogic");
	ol.display();
}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
