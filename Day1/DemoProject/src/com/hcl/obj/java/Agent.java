<<<<<<< HEAD
package com.hcl.obj.java;

public class Agent {
	
	public StringBuilder show(String agentId,
							  String fullName,
							  int maritalStatus,
							  String zipcode){
		StringBuilder sbError = new StringBuilder();
		boolean isValid = true;
		if(agentId.charAt(0)!= 'A'){
			sbError.append("Agent ID must starts with Letter A"+"\r\n");
			isValid = false;
		}
		if(fullName.indexOf(' ') == -1){
			sbError.append("Name contains both First and Last Name"+"\r\n");
			isValid = false;
		}
		if(fullName.length() >=20 ){
			sbError.append("Name cannot be greater than 20 character"+"\r\n");
			isValid = false;
		}
		if(maritalStatus !=0 && maritalStatus !=1){
			sbError.append("Different marital Status entered"+"\r\n");
			isValid = false;
		}
		if(zipcode.length()!= 6){
			sbError.append("Pincode should be 6 digits"+"\r\n");
			isValid = false;
		}
		if(isValid == true){
			sbError.append("AgentID = "+agentId+"\r\n");
			sbError.append("Name = "+fullName+"\r\n");
			sbError.append("Marital Status = "+maritalStatus+"\r\n");
			sbError.append("PinCode = "+zipcode+"\r\n");
			
		}
		
			return sbError;
		
	}
	
	public static void main(String[] args) {
		String agentId = "A38U383";
		  String fullName = "Aditya Kohli";
		  int maritalStatus = 2;
		  String zipcode = "224748";
		  
		  StringBuilder sbRes = new Agent().show(agentId,fullName,maritalStatus,zipcode);
		  		System.out.println(sbRes);
	}

}
=======
package com.hcl.obj.java;

public class Agent {
	
	public StringBuilder show(String agentId,
							  String fullName,
							  int maritalStatus,
							  String zipcode){
		StringBuilder sbError = new StringBuilder();
		boolean isValid = true;
		if(agentId.charAt(0)!= 'A'){
			sbError.append("Agent ID must starts with Letter A"+"\r\n");
			isValid = false;
		}
		if(fullName.indexOf(' ') == -1){
			sbError.append("Name contains both First and Last Name"+"\r\n");
			isValid = false;
		}
		if(fullName.length() >=20 ){
			sbError.append("Name cannot be greater than 20 character"+"\r\n");
			isValid = false;
		}
		if(maritalStatus !=0 && maritalStatus !=1){
			sbError.append("Different marital Status entered"+"\r\n");
			isValid = false;
		}
		if(zipcode.length()!= 6){
			sbError.append("Pincode should be 6 digits"+"\r\n");
			isValid = false;
		}
		if(isValid == true){
			sbError.append("AgentID = "+agentId+"\r\n");
			sbError.append("Name = "+fullName+"\r\n");
			sbError.append("Marital Status = "+maritalStatus+"\r\n");
			sbError.append("PinCode = "+zipcode+"\r\n");
			
		}
		
			return sbError;
		
	}
	
	public static void main(String[] args) {
		String agentId = "A38U383";
		  String fullName = "Aditya Kohli";
		  int maritalStatus = 2;
		  String zipcode = "224748";
		  
		  StringBuilder sbRes = new Agent().show(agentId,fullName,maritalStatus,zipcode);
		  		System.out.println(sbRes);
	}

}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
