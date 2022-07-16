package com.constructor;

public class Parameterized_Constructor {
	int num;
	String name;
	Parameterized_Constructor(int n,String m){
		num = n;
		name = m;
	}
	public void display() {
		System.out.println(num + "-->" + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_Constructor param = new Parameterized_Constructor(2,"Shyam");
		param.display();
	}

}
