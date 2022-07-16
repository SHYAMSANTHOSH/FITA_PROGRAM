package com.file;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter f;
		try {
			f = new FileWriter("F:\\File\\ReadFile.txt");
			f.write("Shyam");
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
