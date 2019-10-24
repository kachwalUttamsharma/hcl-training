<<<<<<< HEAD
package com.hcl.day6.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("Priya", "Darshni");
		m.put("Laksh", "Laksh");
		m.put("Rishab", "Hcl");
		m.put("Kirumba", "Lakshmi");
		
		String key = "Priya";
		String value = (String)m.getOrDefault(key, "Not Found");
		System.out.println(value);
		
	}
}
=======
package com.hcl.day6.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("Priya", "Darshni");
		m.put("Laksh", "Laksh");
		m.put("Rishab", "Hcl");
		m.put("Kirumba", "Lakshmi");
		
		String key = "Priya";
		String value = (String)m.getOrDefault(key, "Not Found");
		System.out.println(value);
		
	}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
