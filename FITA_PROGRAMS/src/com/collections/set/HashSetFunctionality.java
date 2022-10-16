package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hashset = new HashSet<Integer>();
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		hashset.add(10);
		System.out.println("Test");
		System.out.println(hashset);
		hashset.remove(8);
		System.out.println(hashset);
		if(hashset.contains(60)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		hashset.clear();
		System.out.println(hashset);
	}

}
