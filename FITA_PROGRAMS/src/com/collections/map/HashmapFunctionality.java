package com.collections.map;

import java.util.*;
import java.util.Map.Entry;

public class HashmapFunctionality {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();

		map.put(8, "Saravana");

		//map.put(10, null);
		map.put(100, "Ijaz");
		map.put(1, "Shyam");
		map.put(2, "Rahul");
		map.put(3, "Saravana");
		map.put(5, "Saravana");
		map.put(4, "Sathish");
		map.put(4, "Rahul");
		System.out.println(map);
		//int[] map1 = {10,50,30,90,29};
		
//		for(int ma:map1) {
//			System.out.println(ma);
//		}
		int num =0;
		for(Map.Entry<Integer,String> mapall : map.entrySet()) {
			if(mapall.getValue().equalsIgnoreCase("Shyam")) {
				num = mapall.getKey();
				
			}
			//System.out.println(mapall);
			//System.out.println(mapall.getValue());
			//System.out.println(mapall.getKey());
		}
		
		System.out.println(num);
//		Map<String,String> hmap = new HashMap<String,String>();
//		Map<Integer,String> duphmap = new HashMap<Integer,String>();
//		hmap.put("Admin", "Shyam");
//		hmap.put("User", "Kumar");
//		hmap.put("User1", "Rahul");
//		hmap.put("User2", "");
//		hmap.put("User3", "Done");
//		hmap.put("User4", "Dhoni");
//		int[] num = {10,40,70,89,20};
//		for(int i:num) {
//			System.out.println(i);
//		}
//		String admin = "";
//		for(Map.Entry<String,String> mapp : hmap.entrySet()) {
//			if(mapp.getKey().contains("Adm")) {
//				admin = mapp.getValue();
//			}
//		}
//		
//		System.out.println("---->" + admin);
//		//duphmap.putAll(hmap);
//		//duphmap.put(100, "Kohli");
//		System.out.println(hmap);
//		System.out.println(hmap.get(10));
//		System.out.println(duphmap);
//		//hmap.putIfAbsent(30, "TEST123");
//		//hmap.remove(10);
//		System.out.println(hmap);
		
	}

}
