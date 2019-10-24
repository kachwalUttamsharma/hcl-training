<<<<<<< HEAD
package com.hcl.homework;
public class Multi{
public void calc(String[] s1,String[] s2){
	//int s;
	String[] s3 = new String[100];
	int l1 = s1.length;
	int l2 = s2.length;
	int c = 0,res;
	for(int j = 0 ; j<l2 ; j++) {
	for(int i = l1-1;i>0;i--){
		res = Integer.parseInt(s2[l2-1-j])*Integer.parseInt(s1[i]);
		res = res + c;
		if(res>=10){
			c=res/10;
			res=res%10;
		}else{
			c=0;
		}
		s1[i-1]=""+(Integer.parseInt(s1[i-1])) ;
		s3[i+2]="" + res;
	}
	j++;
	}
	for (String string : s3) {
		System.out.print(string + " ");
	}
	
	

}

public static void main(String[] args) {
	Multi m1 = new Multi();
	String[] s1 = new String[]{"5","3","2","3","8","2","6","3"};
	String[] s2 = new String[]{"2","3","4","2"};
	
	m1.calc( s1 , s2 );
}
}

=======
package com.hcl.homework;
public class Multi{
public void calc(String[] s1,String[] s2){
	//int s;
	String[] s3 = new String[100];
	int l1 = s1.length;
	int l2 = s2.length;
	int c = 0,res;
	for(int j = 0 ; j<l2 ; j++) {
	for(int i = l1-1;i>0;i--){
		res = Integer.parseInt(s2[l2-1-j])*Integer.parseInt(s1[i]);
		res = res + c;
		if(res>=10){
			c=res/10;
			res=res%10;
		}else{
			c=0;
		}
		s1[i-1]=""+(Integer.parseInt(s1[i-1])) ;
		s3[i+2]="" + res;
	}
	j++;
	}
	for (String string : s3) {
		System.out.print(string + " ");
	}
	
	

}

public static void main(String[] args) {
	Multi m1 = new Multi();
	String[] s1 = new String[]{"5","3","2","3","8","2","6","3"};
	String[] s2 = new String[]{"2","3","4","2"};
	
	m1.calc( s1 , s2 );
}
}

>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
