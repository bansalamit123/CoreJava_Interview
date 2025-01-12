
package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		StudentSerializable s = new StudentSerializable(20, " amit");

		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\Amit\\OneDrive\\Desktop\\IO\\student.txt"));

		out.writeObject(s);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Amit\\OneDrive\\Desktop\\IO\\student.txt"));

		s = (StudentSerializable) in.readObject();

		System.out.println(s);

	}

}
