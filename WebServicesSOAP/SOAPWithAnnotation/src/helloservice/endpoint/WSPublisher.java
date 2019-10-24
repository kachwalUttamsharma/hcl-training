package helloservice.endpoint;

import javax.xml.ws.Endpoint;

public class WSPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://192.168.1.12:8986/Hello", new Hello());
	}
}
