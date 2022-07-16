package com.string;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shyam"; // Char array sequece
		char c = 'a';
		char namearray[] = {'S','h','y','a','m'};
		//System.out.println(name.charAt(1));
		//System.out.println(namearray[1]);
		
		String value = new String("Shyam");
		String value1 = new String(name);
		
		String value2 = "Kumar";
		String value3 = new String("Santhsh");
		String value4 = "Shyam";
		// == & equals
		
		System.out.println(name == value);
		System.out.println(name.equals(value));
		System.out.println(value == value1);
		System.out.println(name == value4);
	}

}
