<<<<<<< HEAD
package com.hcl.department;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.department.DataQueryDao;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DataQueryDao d=(DataQueryDao)ctx.getBean("myDao");
//	d.showDepartment();
	d.searchDepartment(1);	
	}
}
=======
package com.hcl.department;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.department.DataQueryDao;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DataQueryDao d=(DataQueryDao)ctx.getBean("myDao");
//	d.showDepartment();
	d.searchDepartment(1);	
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
