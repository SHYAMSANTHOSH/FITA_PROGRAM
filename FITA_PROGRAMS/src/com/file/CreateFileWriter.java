package com.file;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFileWriter {

	public static void main(String[] args) throws IOException {
		
		 FileWriter f;
		 try { 
			 f = new FileWriter("F:\\File\\ReadFile.txt");
			 f.write("Shyam"); 
			 f.close(); 
		 }catch (IOException e) {  
		  e.printStackTrace(); 
		  }
		 
		
		FileWriter f1 = new FileWriter("F:\\study\\Fita\\WriteFile.txt");
		f1.write("Sample Data to  store in text file");
		f1.close();
		
	}

}
