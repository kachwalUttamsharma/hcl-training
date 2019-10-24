<<<<<<< HEAD
package com.hcl.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class libraryBAL {

	Connection con;
	PreparedStatement pst;
	
	public static ArrayList<books> searchBookBal(String searchtype,String value){
		//con = DaoConnection.getConnection();
		
		//String cmd = "select * from books where ? = ?";
		
		
		return new libraryDAO().Searchbook(searchtype,value);
	}
	
	
	public static String loginBal(String user,String pwd) {
		return new libraryDAO().loginDao(user, pwd);
	}
}
=======
package com.hcl.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class libraryBAL {

	Connection con;
	PreparedStatement pst;
	
	public static ArrayList<books> searchBookBal(String searchtype,String value){
		//con = DaoConnection.getConnection();
		
		//String cmd = "select * from books where ? = ?";
		
		
		return new libraryDAO().Searchbook(searchtype,value);
	}
	
	
	public static String loginBal(String user,String pwd) {
		return new libraryDAO().loginDao(user, pwd);
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
