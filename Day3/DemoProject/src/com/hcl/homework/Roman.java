<<<<<<< HEAD
package com.hcl.homework;


public class Roman {

	public void calc(String x){
		String[] str1 = new String[]{"i","ii","iii","iv","v","vi","vii","viii","ix"};
		String[] str2 = new String[]{"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] str3 = new String[2];
		char[] c = x.toCharArray();
		int n = Integer.parseInt("" +c[0]);
		int m = Integer.parseInt("" +c[1]);
		if(n==0){
			str3[0]=" ";
			str3[1]=str1[m-1];
		}else{
			str3[0]=str2[n-1];
			str3[1]=str1[m-1];
			
		}
		for(String d : str3) {
			System.out.print(d);
		}
		
		
		}
		
	public static void main(String[] args) {
		Roman R1 = new Roman();
		R1.calc("96");
		
	}
		
}
	
=======
package com.hcl.homework;


public class Roman {

	public void calc(String x){
		String[] str1 = new String[]{"i","ii","iii","iv","v","vi","vii","viii","ix"};
		String[] str2 = new String[]{"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] str3 = new String[2];
		char[] c = x.toCharArray();
		int n = Integer.parseInt("" +c[0]);
		int m = Integer.parseInt("" +c[1]);
		if(n==0){
			str3[0]=" ";
			str3[1]=str1[m-1];
		}else{
			str3[0]=str2[n-1];
			str3[1]=str1[m-1];
			
		}
		for(String d : str3) {
			System.out.print(d);
		}
		
		
		}
		
	public static void main(String[] args) {
		Roman R1 = new Roman();
		R1.calc("96");
		
	}
		
}
	
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
