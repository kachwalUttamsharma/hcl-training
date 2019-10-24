<<<<<<< HEAD
package com.hcl.ex;

public class Mathfnc {
  public void Method1(int a, int b){
	  int p=1;
	  for(int i=1;i<=b;i++){
		  p=p*a;
	  }
	  System.out.println("Power is " +p);
  }
  
  public int Method2(int a,int b){
	  if(a>b){
		  return a;
	  }return b;
  }
  
 public void Method3(String str1){
	 int l=0; 
	 int l1 = str1.length();
	 //int i = l;
	 char[] ch = str1.toCharArray();
	 while(ch[l]!='.'){
		 l++;
	 }
	 for (int i=l;i<=l1;i++){
		 //ch2[]=ch
	 }
	 
 }
  
  public static void main(String[] args) {
	Mathfnc m1 = new Mathfnc();
	
	m1.Method1(2, 4);
	int max = m1.Method2(2, 7);
	System.out.println(max);
  }
}
=======
package com.hcl.ex;

public class Mathfnc {
  public void Method1(int a, int b){
	  int p=1;
	  for(int i=1;i<=b;i++){
		  p=p*a;
	  }
	  System.out.println("Power is " +p);
  }
  
  public int Method2(int a,int b){
	  if(a>b){
		  return a;
	  }return b;
  }
  
 public void Method3(String str1){
	 int l=0; 
	 int l1 = str1.length();
	 //int i = l;
	 char[] ch = str1.toCharArray();
	 while(ch[l]!='.'){
		 l++;
	 }
	 for (int i=l;i<=l1;i++){
		 //ch2[]=ch
	 }
	 
 }
  
  public static void main(String[] args) {
	Mathfnc m1 = new Mathfnc();
	
	m1.Method1(2, 4);
	int max = m1.Method2(2, 7);
	System.out.println(max);
  }
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
