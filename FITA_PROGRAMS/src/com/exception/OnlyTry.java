package com.exception;

public class OnlyTry {

	public static void main(String[] args) {
		
		
		int num =100;
		for(int i=5;i>=0;i--) {
			try {
				System.out.println(num/i);
			}
			//System.out.println("Between Try and Catch");
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
