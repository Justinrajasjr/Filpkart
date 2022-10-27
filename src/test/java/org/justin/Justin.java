package org.justin;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Justin {
	public static void main(String[] arg) {
		Map m = new LinkedHashMap();
		m.put("tamil", 90);
		m.put("english", 85);
		Collection values = m.values();
		 Set ju = m.keySet();
		System.out.println(values);
		System.out.println(ju);
		System.out.println("hai from cloud");
		
		System.out.println("hai from local");
	}

}
