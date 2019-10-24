<<<<<<< HEAD
package com.hcl.ems;

import java.util.List;

import org.junit.Test;


public class Testems {

	@Test
	public void getEmployLeavesTest() {
		List<Leaves> leaves = EmsBal.getEmployLeavesBal(1000);
	
		for (Leaves leave : leaves) {
			System.out.println(leave.getReason());
		}
	}
}
=======
package com.hcl.ems;

import java.util.List;

import org.junit.Test;


public class Testems {

	@Test
	public void getEmployLeavesTest() {
		List<Leaves> leaves = EmsBal.getEmployLeavesBal(1000);
	
		for (Leaves leave : leaves) {
			System.out.println(leave.getReason());
		}
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
