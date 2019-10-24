<<<<<<< HEAD
package com.hcl.employ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
 public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
	DataQueryDao d=(DataQueryDao)ctx.getBean("myDao");
//	d.showEmploy();
	d.searchEmploy(2);
}
}
=======
package com.hcl.employ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
 public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
	DataQueryDao d=(DataQueryDao)ctx.getBean("myDao");
//	d.showEmploy();
	d.searchEmploy(2);
}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
