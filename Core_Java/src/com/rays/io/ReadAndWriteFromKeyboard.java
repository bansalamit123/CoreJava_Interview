
package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteFromKeyboard {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("C://Users//hp//Desktop//IO/amit",true);

		System.out.println("enter heremmmmmmmm.....");

		String str = br.readLine();

		while (str != null) {
			fw.write(str);

			System.out.println(str);
			str = br.readLine();

		}
		fw.close();
		br.close();	
		
	}

}
