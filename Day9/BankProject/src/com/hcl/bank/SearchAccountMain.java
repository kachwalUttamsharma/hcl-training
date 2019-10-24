<<<<<<< HEAD
package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {

	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNo ");
		accountNo = sc.nextInt();
		Accounts objAccounts = AccountBAL.searchAccountBal(accountNo);
		if(objAccounts!=null){
			System.out.println("First Name : " + objAccounts.getFirstName());
			System.out.println("Last Name : " + objAccounts.getLastName());
			System.out.println("City : " + objAccounts.getCity());
			System.out.println("State : " + objAccounts.getState());
			System.out.println("Amount : " + objAccounts.getAmount());
			System.out.println("CheqFacil : " + objAccounts.getCheqFacil());
			System.out.println("Account Type : " + objAccounts.getAccountType());
			
		}else{
			System.out.println("Account Not Found");
		}
		
	}
}
=======
package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {

	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNo ");
		accountNo = sc.nextInt();
		Accounts objAccounts = AccountBAL.searchAccountBal(accountNo);
		if(objAccounts!=null){
			System.out.println("First Name : " + objAccounts.getFirstName());
			System.out.println("Last Name : " + objAccounts.getLastName());
			System.out.println("City : " + objAccounts.getCity());
			System.out.println("State : " + objAccounts.getState());
			System.out.println("Amount : " + objAccounts.getAmount());
			System.out.println("CheqFacil : " + objAccounts.getCheqFacil());
			System.out.println("Account Type : " + objAccounts.getAccountType());
			
		}else{
			System.out.println("Account Not Found");
		}
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
