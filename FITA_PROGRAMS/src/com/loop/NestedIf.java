package com.loop;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Coimbatore, Tamilnadu";
		if(name.endsWith("nadu")) {
			if(name.startsWith("Chn")) {
				System.out.println("Your City is Coimbatore");
			}
		}else {
			System.out.println("Your State not tamilnadu");
		}
		System.out.println("Over");
	}

}
