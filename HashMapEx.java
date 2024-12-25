package com.csi.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {

		//		In HashMap Multiple null values are allowed but it only allows one null Key.

		Map<String, String> map = new HashMap<String, String>();

		map.put("ID", "111");
		map.put("Name", "222");
		map.put("Address", "PCMC");
		map.put("Salary", "9200.23");// Override by the same key value Duplicate keys are not allowed value are allowed								
		map.put("Salary", "123");
		map.put("ID", "123");
		map.put("Company", null);
		map.put(null, null);


		// System.out.println(map);

		//		for (Map.Entry<String, String> m : map.entrySet()) {
		//			System.out.println(m.getKey()+":"+m.getValue());
		//
		//		}

		map.forEach((k,v)-> System.out.println(k+":"+v));
		
//		map.entrySet().stream().forEach(k -> System.out.println(k.getKey()+":"+k.getValue()));

	}

}
