<<<<<<< HEAD
package com.hcl.inventory;

import java.util.Scanner;

public class SearchInventoryMain {

	public static void main(String[] args) {
	    String stockId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StockId ");
		stockId = sc.nextLine();
		Stock objStock = InventoryBAL.searchStockBal(stockId);
		if(objStock!=null){
			System.out.println("Item Name : " + objStock.getItemName());
			System.out.println("Price : " + objStock.getPrice());
			System.out.println("Quantity Available : " + objStock.getQuantityAvail());
			
		}else{
			System.out.println("Stock Not Found");
		}
		
	}
}
=======
package com.hcl.inventory;

import java.util.Scanner;

public class SearchInventoryMain {

	public static void main(String[] args) {
	    String stockId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StockId ");
		stockId = sc.nextLine();
		Stock objStock = InventoryBAL.searchStockBal(stockId);
		if(objStock!=null){
			System.out.println("Item Name : " + objStock.getItemName());
			System.out.println("Price : " + objStock.getPrice());
			System.out.println("Quantity Available : " + objStock.getQuantityAvail());
			
		}else{
			System.out.println("Stock Not Found");
		}
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
