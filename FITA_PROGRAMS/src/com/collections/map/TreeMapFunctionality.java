package com.collections.map;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapFunctionality {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();

		tmap.put(8, "Saravana");
		tmap.put(10, "Test");
		tmap.put(100, "Ijaz");
		tmap.put(1, "Shyam");
		tmap.put(2, "Rahul");
		tmap.put(3, "Saravana");
		tmap.put(5, "Saravana");
		tmap.put(4, "Sathish");
		tmap.put(4, "Rahul");
		
		System.out.println(tmap);
		
		TreeMap<String,Integer> tmap1 = new TreeMap<String,Integer>();
		tmap1.put("hai", 10);
		tmap1.put("56", null);
		tmap1.put("Kite", 70);
		tmap1.put("all", null);
		//tmap1.put(null, 10);
		System.out.println(tmap1);
	}

}
