package com.fita.team2.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistOtherMethods extends ArrayListProgram{

	public static void main(String[] args) {
		
		ArraylistOtherMethods ap = new ArraylistOtherMethods();
		ap.callMethod();
		List<String> studentlist = new ArrayList<String>();
	
		Collections.addAll(studentlist,"Shyam","Mani","Peter","Barani","Aravinth","Deepak","Sathish","Rahul","Venkat","Dravid","Naveen");
		
		List<String> oldrecord = new ArrayList<String>();
		Collections.addAll(oldrecord,"Shyam","Mani","Peter","Barani","Naveen");
		
		System.out.println("Before Deletion : " + studentlist  );
		studentlist.removeAll(oldrecord);
		System.out.println("After Deletion : " + studentlist);
		
		studentlist.set(4, "Aravind");
		for(String s : studentlist) {
			System.out.println(s);
		}

	}

}
