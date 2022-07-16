package com.array;

public class TwoDimensionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[3][3];
		
		num[0][0] = 7;
		num[0][1] = 11;
		num[0][2] = 13;
		num[1][0] = 12;
		num[1][1] = 1;
		num[1][2] = 6;
		num[2][0] = 4;
		num[2][1] = 6;
		num[2][2] = 8;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
