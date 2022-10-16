package com.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashmapFunctionality {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lmap = new LinkedHashMap<Integer,String>();

		lmap.put(null, "Saravana");
		lmap.put(1, "Shyam");
		lmap.put(null, "Rahul");
		lmap.put(3, "Saravana");
		lmap.put(5, "Saravana");
		lmap.put(4, "Sathish");
		lmap.put(4, "Rahul");
		
		System.out.println(lmap);

	}

}
