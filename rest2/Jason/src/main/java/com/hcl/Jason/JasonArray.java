package com.hcl.Jason;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JasonArray {
public static void main(String[] args) {
	JSONObject object=new JSONObject();
	for(int i=0;i<3;i++){
	JSONArray arr = new JSONArray();  
	  arr.add("Emp"+i);    
	  arr.add(1000*i);    
	  arr.add(25+i);
	  object.put(i,arr); 
}
System.out.println(object);
}
}
