package com.file;

import java.io.File;

public class DeleteOldFile {

	public static void main(String[] args) {
		File fi = new File("F:\\File");
		if(fi.exists()) {
			System.out.println("List of File before deleting");
			File[] list = fi.listFiles();
			for(File li : list) {
				System.out.println(li.getName());
			}
			System.out.println("List of File after deleting");
			
			 long Deletion = System.currentTimeMillis() - (2 * 24 * 60 * 60 * 1000);
			 for(File f1 : list) { 
				 if(fi.lastModified() < Deletion) { 
					 f1.delete(); 
				}else {
					System.out.println(fi.getName()); 
				}
			}
			 
		}
	}

}
