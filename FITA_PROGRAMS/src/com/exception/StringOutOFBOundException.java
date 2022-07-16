package com.exception;

public class StringOutOFBOundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name = "Shyam";
			System.out.println(name.charAt(6));
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
