
package com.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveData {

	public static void main(String[] args) throws IOException {

		DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\hp\\Desktop\\IO\\Primitive"));

		out.writeInt(10);
		out.writeBoolean(true);
		out.writeDouble(45.25);
		out.writeChar('A');
		out.writeFloat(2.2F);

		out.close();

		System.out.println("data added......");

		DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\hp\\Desktop\\IO\\Primitive"));

		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		System.out.println(in.readChar());
		System.out.println(in.readFloat());

		in.close();

	}

}
