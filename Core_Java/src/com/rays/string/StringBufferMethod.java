
package com.rays.string;

public class StringBufferMethod {

    public static void main(String[] args) {

        // Create a StringBuffer object with initial value "Amit"
        StringBuffer sb = new StringBuffer("Amitttt");

        // Append "bansal" to the existing StringBuffer content
        sb.append("bansal");

        // Print the current content of the StringBuffer
        System.out.println(sb);

        // Print the length of the StringBuffer
        System.out.println("Length: " + sb.length());

        // Print the current capacity of the StringBuffer
        System.out.println("Capacity: " + sb.capacity());

        // Print the character at index 1 (zero-based index)
        System.out.println(sb.charAt(1));

        // Find the index of the substring "bansal" within the StringBuffer
        System.out.println(sb.indexOf("bansal"));

        // Replace characters from index 1 to 5 (exclusive) with "helloo"
        System.out.println(sb.replace(1, 5, "hello"));

        // Reverse the content of the StringBuffer
        System.out.println(sb.reverse());

    }

}
