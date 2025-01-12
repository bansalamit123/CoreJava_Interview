package com.rays.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharByCharReadWrite {
    public static void main(String[] args) throws IOException {
        String sourceFile = "C:\\Users\\Amit\\OneDrive\\Desktop\\IO\\sourcee.txt"; // Source file path
        String targetFile = "C:\\Users\\Amit\\OneDrive\\Desktop\\IO\\targett.txt"; // Target file path

      
            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(targetFile);
       
            int ch;
            // Read and write character by character
            while ((ch = fr.read()) != -1) {
                fw.write(ch); // Write the character to the target file
        
            System.out.println("File copied character by character successfully!");
       // Print exception details if any error occurs
          
        }
            fw.close();
            fr.close();
            
    }
}
