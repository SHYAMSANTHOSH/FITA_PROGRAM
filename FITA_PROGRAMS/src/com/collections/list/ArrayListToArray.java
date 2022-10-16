package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		List<String> city = new ArrayList<String>();
		city.add("Coimbatore");
		city.add("Chennai");
		city.add("Madurai");
		
		String [] cityname = city.toArray(new String[city.size()]);
		for(String name : cityname)
			System.out.println();
	}

}
