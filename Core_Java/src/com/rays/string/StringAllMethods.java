
package com.rays.string;

public class StringAllMethods {

	public static void main(String[] args) {
        String name = "Amit bansal";
        String str = " Hello";

        // Print length of the string
        System.out.println("String length: " + name.length());

        // Print character at index 6
        System.out.println("String charAt: " + name.charAt(1));

        // Print index of first occurrence of 'a'
        System.out.println("String IndexOf 'a': " + name.indexOf("a"));

		
		 // Print index of first occurrence of 'R' (not found, so returns -1)
		 System.out.println("String IndexOf 'H': " + name.indexOf("h"));
		 

		
		  // Print last index of 'i' 
		   System.out.println("String lastIndexOf 'i': " +name.lastIndexOf("s"));
		 
        // Replace 'B' with 'a' (case sensitive)
        System.out.println("String replace: " + name.replace("b", "a"));

        // Convert to lowercase
        System.out.println("String toLowerCase: " + name.toLowerCase());

        // Convert to uppercase
        System.out.println("String toUpperCase: " + name.toUpperCase());

        // Check if string starts with "K"
        System.out.println("String startsWith 'A': " + name.startsWith("A"));

        // Check if string ends with "d"
        System.out.println("String endsWith 'b': " + name.endsWith("b"));

        // Print substring starting from index 6 to end
        System.out.println("String substring from index 6: " + name.substring(6));

        // Concatenate two strings
        System.out.println("String Concatenation: "+name.concat(str));

        // Trim leading and trailing whitespace from string
        System.out.println("Trimmed string: " + str.trim());

        // Split string based on space
        String str1 = "hellow java";
        String[] s = str1.split(" ");
        for (String s1 : s) {
            System.out.print("fdgghh:" + s1);
        }
    }

}
