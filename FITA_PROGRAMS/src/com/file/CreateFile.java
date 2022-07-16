package com.file;

import java.io.File;
import java.io.IOException;  


public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int b;
		File f = new File("F:\\study\\Fita\\SampleNewProgram.java");
		if(f.createNewFile()) {
			System.out.println("File Created");
		}else {
			System.out.println("File Already Exists");
		}
		
		
		/*
		 * if(f.createNewFile()) { System.out.println(f.getName() + " Created"); }else {
		 * System.out.println("Already Exist"); }
		 */
	}

}
