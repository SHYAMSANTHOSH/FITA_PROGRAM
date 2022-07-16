package com.array;

public class ArrayMethodProgram {

	public static void iterateChar(char[] callingvalue){
		for(int i =0;i<callingvalue.length;i++) {
			System.out.println(callingvalue[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []name = {'S','H','Y','A','M'};
		iterateChar(name);
	}

}
