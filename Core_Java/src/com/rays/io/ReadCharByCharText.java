
package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharText {

	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("C:\\Users\\Amit\\OneDrive\\Desktop\\IO\\readchar.txt");

		int i = file.read();

		while (i != -1) {

			System.out.print((char) i);

			i = file.read();

		}

		file.close();

	}

}
