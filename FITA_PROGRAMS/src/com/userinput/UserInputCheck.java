package com.userinput;

import java.util.Scanner;

public class UserInputCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Number of a : " + a);
		char d ='A';
		System.out.println("User Character : " + d);
		char c = scan.next().toCharArray()[3];
		System.out.println("Input Character : " + c);
		
	}

}
