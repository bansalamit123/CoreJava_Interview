
package com.rays.streamapi;

import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("c", "b", "a");

		String[] stringArray = stringStream.toArray(e -> new String[e]);

		for (String string : stringArray) {
			System.out.println(string);
		}
      // System.out.println(stringArray[0]);   
	}

}
