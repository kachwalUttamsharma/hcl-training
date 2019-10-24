<<<<<<< HEAD
package com.hcl.inventory;

import java.util.Scanner;

public class AddStockMain {
	public static void main(String[] args) {
		String stockId = InventoryBAL.generateStockIdBal();
		//System.out.println(stockId);
		Stock objStock = new Stock();
		objStock.setStockId(stockId);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item Name ");
		objStock.setItemName(sc.nextLine());
		System.out.println("Enter Price ");
		objStock.setPrice(sc.nextDouble());
		System.out.println("Enter Quanity Available ");
		objStock.setQuantityAvail(sc.nextInt());
		System.out.println(InventoryBAL.addStockIdBal(objStock));
	}
}
=======
package com.hcl.inventory;

import java.util.Scanner;

public class AddStockMain {
	public static void main(String[] args) {
		String stockId = InventoryBAL.generateStockIdBal();
		//System.out.println(stockId);
		Stock objStock = new Stock();
		objStock.setStockId(stockId);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item Name ");
		objStock.setItemName(sc.nextLine());
		System.out.println("Enter Price ");
		objStock.setPrice(sc.nextDouble());
		System.out.println("Enter Quanity Available ");
		objStock.setQuantityAvail(sc.nextInt());
		System.out.println(InventoryBAL.addStockIdBal(objStock));
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
