package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		
		String [] name = {"Shyam","Kummar","Mani","Peter"};
		List<String> li = new ArrayList<String>();
		for(String na : name) {
			li.add(na);
		}
		System.out.println("---");
		System.out.println(li);
		
//		for(String n : li) {
//			System.out.println(n);
//		}
	}

}
