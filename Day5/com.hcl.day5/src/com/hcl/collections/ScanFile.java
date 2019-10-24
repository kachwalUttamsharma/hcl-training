<<<<<<< HEAD
package com.hcl.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScanFile {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:/files/employ.txt");
			Scanner sc = new Scanner(fin);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
=======
package com.hcl.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScanFile {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:/files/employ.txt");
			Scanner sc = new Scanner(fin);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
