<<<<<<< HEAD
package com.hcl.inventory;

import java.util.Scanner;

public class placeOrderMain {

	public static void main(String[] args) {
		String stockId;
		int quantity;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter StockId ");
		stockId = sc.next();
		System.out.println("Enter Quantity ");
		quantity = sc.nextInt();
		System.out.println(InventoryBAL.placeOrderBal(stockId, quantity));
	}
=======
package com.hcl.inventory;

import java.util.Scanner;

public class placeOrderMain {

	public static void main(String[] args) {
		String stockId;
		int quantity;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter StockId ");
		stockId = sc.next();
		System.out.println("Enter Quantity ");
		quantity = sc.nextInt();
		System.out.println(InventoryBAL.placeOrderBal(stockId, quantity));
	}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
}