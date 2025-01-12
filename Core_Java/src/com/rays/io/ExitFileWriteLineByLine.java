package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExitFileWriteLineByLine {

	public static void main(String[] args) throws IOException {

		// The second parameter true means append mode. If the file already exists, new
		// data will be added to the end of the file without overwriting its existing content.

		FileWriter file = new FileWriter("C:\\Users\\Amit\\OneDrive\\Desktop\\IO\\amit.txt", true);

		PrintWriter out = new PrintWriter(file);

		out.println("hello bhai");

		out.println("kkrh??");

		out.close();

		file.close();

		System.out.println("data write successfully...!!!");

	}

}