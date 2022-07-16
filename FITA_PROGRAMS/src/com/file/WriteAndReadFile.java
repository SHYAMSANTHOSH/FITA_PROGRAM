package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;  

public class WriteAndReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fileName = Path.of(
	            "F:\\File\\ReadFile.txt");
		//String fi = "Hai \n Welcome Fita \n Java Program";
		//Files.writeString(fileName, fi);
		String file_content = Files.readString(fileName);
		 
        System.out.println(file_content);
	}

}
