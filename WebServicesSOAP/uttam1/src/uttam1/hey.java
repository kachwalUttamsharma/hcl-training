package uttam1;

import helloservice.endpoint.HelloProxy;

public class hey {
   public static void main(String[] args) {
	HelloProxy hp = new HelloProxy();
	System.out.println(hp.getHello());
}
}
