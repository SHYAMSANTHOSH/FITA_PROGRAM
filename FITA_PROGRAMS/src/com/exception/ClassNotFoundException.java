package com.exception;

public class ClassNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("CreateFile")	;
		} catch (java.lang.ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class Not Found Exception");
			//e.printStackTrace();
		}

	}

}
