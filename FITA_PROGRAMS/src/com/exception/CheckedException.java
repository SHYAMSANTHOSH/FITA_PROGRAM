package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String filepath = "F:\\study\\Fita\\SampleNewProgram.java";
		File f = new File("F:\\study\\Fita\\SampleNewProgram.txt");
		try {
			FileReader fread = new FileReader(f);
			
			//FileReader fr = new FileReader(filepath);
			System.out.println("Success");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
