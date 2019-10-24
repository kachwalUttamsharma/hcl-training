<<<<<<< HEAD
package com.hcl.library;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.xml.ws.Response;

public class libraryDAO {

	PreparedStatement pst;
	Connection con;
	
	public String Issuebook(int[] id,String username){
		int l = id.length;
		for(int i = 0 ; i<l ; i++){
			con = DaoConnection.getConnection();
			String cmd = "select * from books where id = ?";
			try {
				pst = con.prepareStatement(cmd);
				pst.setInt(1, id[i]);
				ResultSet rs = pst.executeQuery();
				
			   // books b1=new books(rs.getInt("id"),rs.getString("name"),rs.getString("author"),rs.getString("edition"),
				//			 rs.getString("dept"),rs.getInt("totalbooks"));  
					 
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String cm = "Insert into tranbook values (?,?)";
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, username);
				pst.setInt(2, id[i]);
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public ArrayList<books> Searchbook(String searchtype , String value){
		
		con = DaoConnection.getConnection();
		
		String str = searchtype;
		ArrayList<books> book = new ArrayList<books>(20);
		
		switch(str){
		case "id" :
		{
			int idd = Integer.parseInt(value);
			String cmd = "select * from books where id = ?";
			
			
			try {
				book.clear();
				pst = con.prepareStatement(cmd);
				pst.setInt(1, idd);
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					 books b1=new books(idd,rs.getString("name"),rs.getString("author"),rs.getString("edition"),
							 rs.getString("dept"),rs.getInt("totalbooks"));  
					 book.add(b1);
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}break;
		
		case "dept" :
		{

			String cmd = "select * from books where dept = ? ";
			
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, value);
				ResultSet rs = pst.executeQuery();				
				while(rs.next()){
					books b1=new books(rs.getInt("id"),rs.getString("name"),rs.getString("author"),rs.getString("edition"),
							 (String)value,rs.getInt("totalbooks"));
					book.add(b1);
					}
				
			} catch (SQLException e) {
				e.printStackTrace();
		}
			
		}break;
		
		
		case "name" : {
				
			String cmd = "select * from books where name = ?";
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, value);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					books b1=new books(rs.getInt("id"),(String)value,rs.getString("author"),rs.getString("edition"),
							rs.getString("dept"),rs.getInt("totalbooks"));
					book.add(b1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
		
		case "author" :{

			String cmd = "select * from books where author = ?";
			
			
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, value);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					books b1=new books(rs.getInt("id"),rs.getString("name"),(String)value,rs.getString("edition"),
							rs.getString("dept"),rs.getInt("totalbooks"));
					book.add(b1);

				}

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}break;
		
		case "all" :{

			String cmd = "select * from books";
			
			try {
				book.clear();

				pst = con.prepareStatement(cmd);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					books b1=new books(rs.getInt("id"),rs.getString("name"),rs.getString("author"),rs.getString("edition"),
							rs.getString("dept"),rs.getInt("totalbooks"));

					book.add(b1);
				}
				
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		}break;
			
	 
		
		default : {
			System.out.println("Not Correct Inputs");
		}
			
			
		
		}return book;
	}
	
	public String loginDao(String user,String pwd) {
		con = DaoConnection.getConnection();
		String cmd = "select * from libusers where username = ? && password = ?";
		PreparedStatement pst ;
		String result = "";
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, user);
			pst.setString(2, pwd);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				result = "login successfull";
			}else{
				result = "Invalid credentials";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
=======
package com.hcl.library;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.xml.ws.Response;

public class libraryDAO {

	PreparedStatement pst;
	Connection con;
	
	public String Issuebook(int[] id,String username){
		int l = id.length;
		for(int i = 0 ; i<l ; i++){
			con = DaoConnection.getConnection();
			String cmd = "select * from books where id = ?";
			try {
				pst = con.prepareStatement(cmd);
				pst.setInt(1, id[i]);
				ResultSet rs = pst.executeQuery();
				
			   // books b1=new books(rs.getInt("id"),rs.getString("name"),rs.getString("author"),rs.getString("edition"),
				//			 rs.getString("dept"),rs.getInt("totalbooks"));  
					 
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String cm = "Insert into tranbook values (?,?)";
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, username);
				pst.setInt(2, id[i]);
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public ArrayList<books> Searchbook(String searchtype , String value){
		
		con = DaoConnection.getConnection();
		
		String str = searchtype;
		ArrayList<books> book = new ArrayList<books>(20);
		
		switch(str){
		case "id" :
		{
			int idd = Integer.parseInt(value);
			String cmd = "select * from books where id = ?";
			
			
			try {
				book.clear();
				pst = con.prepareStatement(cmd);
				pst.setInt(1, idd);
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					 books b1=new books(idd,rs.getString("name"),rs.getString("author"),rs.getString("edition"),
							 rs.getString("dept"),rs.getInt("totalbooks"));  
					 book.add(b1);
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}break;
		
		case "dept" :
		{

			String cmd = "select * from books where dept = ? ";
			
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, value);
				ResultSet rs = pst.executeQuery();				
				while(rs.next()){
					books b1=new books(rs.getInt("id"),rs.getString("name"),rs.getString("author"),rs.getString("edition"),
							 (String)value,rs.getInt("totalbooks"));
					book.add(b1);
					}
				
			} catch (SQLException e) {
				e.printStackTrace();
		}
			
		}break;
		
		
		case "name" : {
				
			String cmd = "select * from books where name = ?";
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, value);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					books b1=new books(rs.getInt("id"),(String)value,rs.getString("author"),rs.getString("edition"),
							rs.getString("dept"),rs.getInt("totalbooks"));
					book.add(b1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
		
		case "author" :{

			String cmd = "select * from books where author = ?";
			
			
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, value);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					books b1=new books(rs.getInt("id"),rs.getString("name"),(String)value,rs.getString("edition"),
							rs.getString("dept"),rs.getInt("totalbooks"));
					book.add(b1);

				}

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}break;
		
		case "all" :{

			String cmd = "select * from books";
			
			try {
				book.clear();

				pst = con.prepareStatement(cmd);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					books b1=new books(rs.getInt("id"),rs.getString("name"),rs.getString("author"),rs.getString("edition"),
							rs.getString("dept"),rs.getInt("totalbooks"));

					book.add(b1);
				}
				
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		}break;
			
	 
		
		default : {
			System.out.println("Not Correct Inputs");
		}
			
			
		
		}return book;
	}
	
	public String loginDao(String user,String pwd) {
		con = DaoConnection.getConnection();
		String cmd = "select * from libusers where username = ? && password = ?";
		PreparedStatement pst ;
		String result = "";
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, user);
			pst.setString(2, pwd);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				result = "login successfull";
			}else{
				result = "Invalid credentials";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
