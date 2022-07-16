package com.exception;

public class MultipleCatch {

	
	private static void callMethod() throws ArithmeticException{
		
		String name = null;
		System.out.println(name);
		throw new ArithmeticException("Null Pointer Exception thrown");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			callMethod();
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			//System.exit(0);
		}catch (NullPointerException e) {
			System.out.println(e.getMessage() + "Null Pointer");
			
		}
		finally {
			System.out.println("Test");
			System.exit(1);
			System.out.println("Final");
		}

	}

	

}
