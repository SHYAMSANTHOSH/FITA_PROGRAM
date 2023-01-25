package com.exception;

public class InvalidAgeException extends Exception {

	
	InvalidAgeException(String message){
		super(message);
	}
	
	private static void validateAge(int num) throws InvalidAgeException {
		
		if(num<18) {
			throw new InvalidAgeException("Age is below 18. So not allowed");
		}else {
			System.out.println("Age  is allowed");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(15);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
