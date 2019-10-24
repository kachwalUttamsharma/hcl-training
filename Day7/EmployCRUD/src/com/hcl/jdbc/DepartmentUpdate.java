package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int deptno;
		String dname,loc;
		System.out.println("Enter deptno");
		deptno = sc.nextInt();
		System.out.println("Enter dname ");
		dname = sc.next();
		System.out.println("Enter loc ");
		loc = sc.next();
		String cmd = "Update department set dname = ?, loc = ? Where deptno =?";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, dname);
			pst.setString(2, loc);
			pst.setInt(3, deptno);
			pst.executeUpdate();
			System.out.println("<<<<<Records Updated>>>>>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

