package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno,basic;
		String desig;
		System.out.println("Enter Empno");
		empno = sc.nextInt();
		System.out.println("Enter desig ");
		desig = sc.next();
		System.out.println("Enter Basic ");
		basic = sc.nextInt();
		String cmd = "Update Employ set desig = ?, Basic = ? Where empno =?";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, desig);
			pst.setInt(2, basic);
			pst.setInt(3, empno);
			pst.executeUpdate();
			System.out.println("<<<<<Records Updated>>>>>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
