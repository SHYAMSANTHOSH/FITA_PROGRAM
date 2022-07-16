package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileFromText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:\\File\\ReadFile.txt");
		Scanner scan;
		String data = null;
		try {
			scan = new Scanner(f);
			while(scan.hasNextLine()) {
				data = scan.nextLine();
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
