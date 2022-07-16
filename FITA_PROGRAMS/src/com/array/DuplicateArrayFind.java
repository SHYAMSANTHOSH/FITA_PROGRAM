package com.array;

public class DuplicateArrayFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {10,11,12,10,1,14,12,14,20,12,32};
		for(int i=0 ;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}

}
