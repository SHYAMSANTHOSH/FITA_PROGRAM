package com.oops;

public class RuntimePolymorphism extends RuntimePolymorphismParent{
	
	
	public void hello() {
		// TODO Auto-generated method stub
		super.hello();
		System.out.println("This is Child Hello");
	}

	public static void main(String[] args) {
		RuntimePolymorphism run = new RuntimePolymorphism();
		run.hello();

	}

}
