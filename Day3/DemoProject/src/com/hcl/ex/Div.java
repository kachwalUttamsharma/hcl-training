<<<<<<< HEAD
package com.hcl.ex;

public class Div {
	public static void main(String[] args) {
		int a=12,b=6,c;
		
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println(c);
		}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Arguments are mandatory");	
		}
		catch(NumberFormatException e){                   //Always before exception
			System.out.println("Datatypes are not same");
		} 
		catch(ArithmeticException e){                     //Always before exception
			System.out.println("Division by impossible"); 
		} 
		catch (Exception e) {              //Always before exception
			// TODO Auto-generated catch block
			e.printStackTrace();       ////printing the info about exception or error
		}
		finally{
			System.out.println("Program by HCL" );
		}
	}
}
=======
package com.hcl.ex;

public class Div {
	public static void main(String[] args) {
		int a=12,b=6,c;
		
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println(c);
		}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Arguments are mandatory");	
		}
		catch(NumberFormatException e){                   //Always before exception
			System.out.println("Datatypes are not same");
		} 
		catch(ArithmeticException e){                     //Always before exception
			System.out.println("Division by impossible"); 
		} 
		catch (Exception e) {              //Always before exception
			// TODO Auto-generated catch block
			e.printStackTrace();       ////printing the info about exception or error
		}
		finally{
			System.out.println("Program by HCL" );
		}
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
