<<<<<<< HEAD
package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {

	public static void main(String[] args) {
		int accountNo,depositAmount;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter accountNo ");
		accountNo = sc.nextInt();
		System.out.println("Enter Money to deposit ");
		depositAmount = sc.nextInt();
		System.out.println(AccountBAL.depositAccountBal(accountNo, depositAmount));
	}
}
=======
package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {

	public static void main(String[] args) {
		int accountNo,depositAmount;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter accountNo ");
		accountNo = sc.nextInt();
		System.out.println("Enter Money to deposit ");
		depositAmount = sc.nextInt();
		System.out.println(AccountBAL.depositAccountBal(accountNo, depositAmount));
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
