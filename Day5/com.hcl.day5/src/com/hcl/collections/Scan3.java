<<<<<<< HEAD
package com.hcl.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:/files/data.txt");
			fw.write("12 ram 12.5 22 6 34.7 true priya " + " false 42 1.5 221 anand prem 4.6");
			fw.close();
			FileReader fr = new FileReader("c:/files/data.txt");
			Scanner sc = new Scanner(fr);
			while(sc.hasNext()){
				if(sc.hasNextInt()){
					System.out.println(sc.nextInt());
				}else{
					sc.next();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
=======
package com.hcl.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:/files/data.txt");
			fw.write("12 ram 12.5 22 6 34.7 true priya " + " false 42 1.5 221 anand prem 4.6");
			fw.close();
			FileReader fr = new FileReader("c:/files/data.txt");
			Scanner sc = new Scanner(fr);
			while(sc.hasNext()){
				if(sc.hasNextInt()){
					System.out.println(sc.nextInt());
				}else{
					sc.next();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
