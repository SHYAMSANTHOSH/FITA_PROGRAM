package com.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinedHashSetFunctionality {

	public static void main(String[] args) {
		Set<Integer> linkedhash = new LinkedHashSet<Integer>();
		linkedhash.add(10);
		linkedhash.add(20);
		linkedhash.add(30);
		linkedhash.add(10);
		System.out.println("Test");
		System.out.println(linkedhash);
		linkedhash.remove(20);
		System.out.println(linkedhash);
		if(linkedhash.contains(60)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		linkedhash.clear();
		System.out.println(linkedhash);
	}

}
