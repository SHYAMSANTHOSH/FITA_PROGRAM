package com.array;

public class ArrayMethodReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []name = {'S','H','Y','A','M'};
		String specificvalue = iterateChar(name);
		System.out.println(specificvalue);
	}

	static  String iterateChar(char[] callingValue) {
		// TODO Auto-generated method stub
		
		String finalvalue = callingValue[1]+""+callingValue[2];
		
		return finalvalue;
	}

}
