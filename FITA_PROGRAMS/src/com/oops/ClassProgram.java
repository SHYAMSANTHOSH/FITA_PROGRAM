package com.oops;

public class ClassProgram {
	
	public int gear = 5;

	  // behavior or method
	  public void braking() {
	    System.out.println("Working of Braking");
	  }

	public static void main(String[] args) {
		
		ClassProgram c = new ClassProgram();
		c.braking();
		System.out.println(c.gear);;
	}
	
	

}
