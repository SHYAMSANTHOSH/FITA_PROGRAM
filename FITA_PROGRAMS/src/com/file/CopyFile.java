package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

	public static void main(String[] args) {
		String src = "F:\\study\\Fita\\WriteFile.txt";
		String dest = "F:\\File\\Write1.txt";
		InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);

            // buffer size 1K
            byte[] buf = new byte[2048];

            int bytesRead = 0;
            while ((bytesRead = is.read(buf)) > 0) {
                os.write(buf, 0, bytesRead);
            }
        }catch(Exception e) {
        	System.out.println("Failed");
        }
	}
}
