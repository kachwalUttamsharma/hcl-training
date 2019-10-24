<<<<<<< HEAD
package com.hcl.employ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
 public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
	DataInsertDao d=(DataInsertDao)ctx.getBean("myDao");
   d.insertEmploy();
   System.out.println("Record Inserted...");
 }
}
=======
package com.hcl.employ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
 public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
	DataInsertDao d=(DataInsertDao)ctx.getBean("myDao");
   d.insertEmploy();
   System.out.println("Record Inserted...");
 }
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
