package com.userinput;

import java.util.Arrays;
import java.util.Scanner;

public class UserinputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//int a[] = new int[5];
		//int a[] = {7,19,31,3,56,90};
		int length = scan.nextInt();
		int a[] = new int[length];
		for(int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		
		System.out.println("Without Loop " + Arrays.toString(a));
		
	}

}
