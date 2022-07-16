package com.exception;

public class IndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = {10,20,30,50,70};
			System.out.println(a[6]);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
