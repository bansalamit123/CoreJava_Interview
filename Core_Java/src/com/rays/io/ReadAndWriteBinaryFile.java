
package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {
		String source = "C://Users//hp//Desktop//IO//Jai Hanuman.jpeg";
		String target = "C://Users//hp//Desktop//IO//mahiiii.jpg";
 
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int i;
		while ((i = in.read()) != -1) {

			out.write(i);

		}

		System.out.println("succesfffs");
	}

}
