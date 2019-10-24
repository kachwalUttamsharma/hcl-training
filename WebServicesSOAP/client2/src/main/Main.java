package main;

import java.rmi.RemoteException;

import com.hcl.saikumar.SaiKumarProxy;
import com.hcl.web.CalculatorProxy;
import com.u.UttamProxy;
import com.y.YaswanthProxy;

public class Main {
 public static void main(String[] args) {
	CalculatorProxy cp = new CalculatorProxy();
	SaiKumarProxy sk = new SaiKumarProxy();
	YaswanthProxy yp = new YaswanthProxy();
	
	try {
		int a = yp.getInt();
		System.out.println(a);
		int b = sk.getInt();
		System.out.println(b);
		int c = cp.add(a, b);
		System.out.println(c);
		
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
