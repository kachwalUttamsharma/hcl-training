package com;

import java.rmi.RemoteException;

public class main {
   public static void main(String[] args) {
	HelloWorldProxy hw = new HelloWorldProxy();
	
	try {
		System.out.println(hw.sayHelloWorld("yhjum"));
	} catch (MissingName e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
