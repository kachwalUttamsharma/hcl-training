<<<<<<< HEAD
package com.hcl.bank;

import java.util.Scanner;

public class WithdrawAccountMain {

	public static void main(String[] args) {
		int accountNo,withdrawAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter accountNo ");
		accountNo = sc.nextInt();
		System.out.println("Enter withdraw amount");
		withdrawAmount = sc.nextInt();
		System.out.println(AccountBAL.withdrawAccountBal(accountNo, withdrawAmount));
	}
}
=======
package com.hcl.bank;

import java.util.Scanner;

public class WithdrawAccountMain {

	public static void main(String[] args) {
		int accountNo,withdrawAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter accountNo ");
		accountNo = sc.nextInt();
		System.out.println("Enter withdraw amount");
		withdrawAmount = sc.nextInt();
		System.out.println(AccountBAL.withdrawAccountBal(accountNo, withdrawAmount));
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
