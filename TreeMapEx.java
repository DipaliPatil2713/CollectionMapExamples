package com.csi.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		

//		In TreeMap null key is not allowed but Multiple null values are allowed.
//		This is Ordered
		Map<String, String> map = new TreeMap<String, String>();

		map.put("ID", "111");
		map.put("Name", "222");
		map.put("Address", "PCMC");
		map.put("Salary", "9200.23");// Override by the same key value Duplicate keys are not allowed value are allowed								
		map.put("Salary", "123");
		map.put("ID", "123");
		map.put("Company", null);
		


		// System.out.println(map);

		//		for (Map.Entry<String, String> m : map.entrySet()) {
		//			System.out.println(m.getKey()+":"+m.getValue());
		//
		//		}

		map.forEach((k,v)-> System.out.println(k+":"+v));
		
//		map.entrySet().stream().forEach(k -> System.out.println(k.getKey()+":"+k.getValue()));

	}

}
