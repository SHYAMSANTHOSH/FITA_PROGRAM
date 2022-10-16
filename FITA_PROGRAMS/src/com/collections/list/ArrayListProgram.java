package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(123);
		li.add(456);
		li.add(123);
		li.add(789);
		li.add(300);
		
		Collections.addAll(li, 200,300,400,500,600);
		System.out.println(li);
		li.remove(5);
		System.out.println(li);
		System.out.println("****************");
		//li.add(null);
		
		Iterator it = li.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.print(" ");
		}
		
		System.out.println("Before Sorting : ");
		
		for(Integer i:li) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println("After Sorting : Ascending :");
		Collections.sort(li);
		for(Integer i:li) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(li.size());
		System.out.println("Descending : ");
		
		for(int i=li.size()-1;i>=0;i--) {
			System.out.print(li.get(i));
			System.out.print(" ");
		}
		
		//System.out.println(li.get(1)); 
		li.set(2, 100);
		if(li.contains(789) == true) {
			li.remove(3);
		}
		System.out.println(" ");
		for(Integer i:li) {
		
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(" ");
		//li.remove(3);
		//li.clear();
		for(Integer i1 : li) {
			System.out.print(i1);
			System.out.print(" ");
		}
		
	}

}
