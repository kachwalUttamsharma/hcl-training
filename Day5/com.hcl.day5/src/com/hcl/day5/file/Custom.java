<<<<<<< HEAD
package com.hcl.day5.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Custom {
 public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Your name");
	try {
		String name = br.readLine();
		System.out.println("Name is " +name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
=======
package com.hcl.day5.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Custom {
 public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Your name");
	try {
		String name = br.readLine();
		System.out.println("Name is " +name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
