package com.csi.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx {
	
	public static void main(String[] args) {
		SortedMap<Integer,String>sortedMap =new TreeMap<Integer, String>();
		
		sortedMap.put(1,"Sayali");
		sortedMap.put(2,"Jiya");
		sortedMap.put(3,"Rutuja");
		sortedMap.put(4,"Manasi");
		sortedMap.put(5,"Chetana");
            
            sortedMap.forEach((k,v)->System.out.println(k+":"+v));
            
            System.out.println("Last Key : "+sortedMap.lastKey());
            System.out.println("Last Entry: "+sortedMap.lastKey());
            System.out.println("From the 3 Key : "+sortedMap.tailMap(3));
         
//		System.out.println(SortedMap<3,"Rutuja">);
		
	}

}
