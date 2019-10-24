<<<<<<< HEAD
package com.hcl.day5.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudent {

	public static void main(String[] args) {
		
	
	try {
		FileInputStream fin = new FileInputStream("c:/files/student.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Student e = (Student)objin.readObject();
		System.out.println(e);
		objin.close();
		fin.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
=======
package com.hcl.day5.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudent {

	public static void main(String[] args) {
		
	
	try {
		FileInputStream fin = new FileInputStream("c:/files/student.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Student e = (Student)objin.readObject();
		System.out.println(e);
		objin.close();
		fin.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
