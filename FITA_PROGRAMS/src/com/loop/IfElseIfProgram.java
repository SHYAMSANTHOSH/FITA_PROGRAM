package com.loop;

public class IfElseIfProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 80;
		if(score > 75) {
			System.out.println("Grade A");
		}else if(score > 60  && score <= 75) {
			System.out.println("Grade B");
		}else if(score > 50 && score <= 60) {
			System.out.println("Grade C");
		}else if(score >35 && score <= 50) {
			System.out.println("Grade D");
		}else {
			System.out.println("Fail");
		}
		System.out.println("Over");

	}

}
