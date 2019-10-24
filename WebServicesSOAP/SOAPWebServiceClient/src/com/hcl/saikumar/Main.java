package com.hcl.saikumar;

import java.rmi.RemoteException;

public class Main {
 public static void main(String[] args) {
	SaiKumarProxy sk= new SaiKumarProxy();
	String kus = null;
	try {
		kus= sk.getname();
		System.out.println(kus);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
