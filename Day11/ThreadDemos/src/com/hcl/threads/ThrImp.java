package com.hcl.threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable{

	@Override
	public void run() {
		List lstData = new ArrayList();
		lstData.add("Laksh");
		lstData.add("Babbar");
		lstData.add("Sahab");
		lstData.add("Singh");
		lstData.add("Great");
		
		for (Object object : lstData){
			System.out.println(object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class LinkDemo implements Runnable{

	@Override
	public void run() {
		LinkedList lst = new LinkedList();
		lst.add("Bindu");
		lst.add("visa");
		lst.add("anubhav");
		lst.add("janani");
		lst.add("isha");
		
		for (Object object : lst){
			System.out.println(object);
			try {
	  			Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class VectorDemo implements Runnable{

	@Override
	public void run() {
		Vector v = new Vector(3,2);
		v.addElement("Nivedi");
		v.addElement("bhalu");
		v.addElement("chipu");
		v.addElement("gannu");
		v.addElement("bablu");

		for (Object object : v){
			System.out.println("Vector " + object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


public class ThrImp {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ListDemo());
		Thread t2 = new Thread(new LinkDemo());
		Thread t3 = new Thread(new VectorDemo());
		
		t1.start();
		t2.start();
		t3.start();
	}
 }
