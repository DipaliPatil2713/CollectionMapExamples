package com.csi.map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
	public static void main(String[] args) {
		
		 LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		 
		 linkedHashMap.put("One", 1);
		 linkedHashMap.put("Two", 2);
		 linkedHashMap.put("Three", 3);
		 linkedHashMap.put("Four", 4);
		 linkedHashMap.put("Five", 5);
		 
//		 System.out.println(linkedHashMap);
		 
		 linkedHashMap.forEach((k,v)->System.out.println(k+":"+v));
		 
		 System.out.println("Value for Key Two is -->"+linkedHashMap.get("Two"));
		 
//		 linkedHashMap.entrySet().stream().forEach(k-> System.out.println(k.getKey()+":"+k.getValue()));
	}

}
