<<<<<<< HEAD
package com.hcl.day5.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/employ.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			Employ e = new Employ(1,"Laskh",3874.32);
			objout.writeObject(e);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
=======
package com.hcl.day5.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/employ.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			Employ e = new Employ(1,"Laskh",3874.32);
			objout.writeObject(e);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
