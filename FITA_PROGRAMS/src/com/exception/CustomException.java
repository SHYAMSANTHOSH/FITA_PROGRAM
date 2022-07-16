package com.exception;

public class CustomException extends Exception{
	private static int rollno[] = {1, 13, 29, 34,8};
	 
    private static String name[] =
                 {"Shyam", "Kumar", "Barani", "Mani", "Peter"};
 
    private static double fees[] =
         {560.0, 299.00, 110.55,1000.00, 1200.00};
 
    // default constructor
    CustomException() {    }
 
    // parameterized constructor
    CustomException(String str) { 
    	//System.out.println(str);
    	super(str); 
    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  {
            System.out.println("Roll No" + "\t" + "Name" + "\t" + "Exam Fees");
            for(int i=0;i<5;i++) {
            	System.out.println(rollno[i] + "\t" + name[i] + "\t" + fees[i]);
            	if(fees[i] >= 1000.0) {
            		CustomException custom = new CustomException("Fees With Arrear Amount");
            		throw custom;
            	}
            }
		}catch(Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
	}

}
