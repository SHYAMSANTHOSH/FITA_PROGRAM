package com.file;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fdelete = new File("F:\\\\study\\\\Fita\\\\SampleNewProgram.java");
		if(fdelete.delete()) {
			System.out.println("File Deleted");
		}else {
			System.out.println("Given File is not exist");
		}
	}

}
