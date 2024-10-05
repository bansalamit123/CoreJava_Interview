package com.rays.javabasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Example3 implements Serializable {
	//3. Using Deserialization
    public void display() {
        System.out.println("Object created using deserialization");
    }

    public static void main(String[] args) throws Exception {
       
            // Serialize the object
            Example3 original = new Example3();
            FileOutputStream fos = new FileOutputStream("example.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(original);
            oos.close();

            // Deserialize the object
            FileInputStream fis = new FileInputStream("example.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Example3 deserialized = (Example3) ois.readObject();
            ois.close();

            deserialized.display();
      
    }
}