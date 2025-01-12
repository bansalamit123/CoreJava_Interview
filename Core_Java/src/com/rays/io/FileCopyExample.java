package com.rays.io;

import java.io.*;
import java.nio.file.*;

public class FileCopyExample {
	public static void main(String[] args) throws IOException {
		Path inputPath = Paths.get("C:\\Users\\Amit\\OneDrive\\Desktop\\IO\\readLine.txt");
		Path outputPath = Paths.get("C:\\Users\\Amit\\OneDrive\\Desktop\\IO\\kkkkkkkk.txt");

		BufferedReader br = Files.newBufferedReader(inputPath);
		BufferedWriter out = Files.newBufferedWriter(outputPath);

		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
			out.write(str);
			out.newLine();
		}
		
		

	}
}
