
package com.rays.javabasic;

public class NotesCount {

	public static void main(String[] args) {
		int[] notes = { 100, 200, 500, 50, 20, 10 };

		int count = 0;
		int rupe = 4500;

		for (int i = 0; i < notes.length; i++) {
			
			count = rupe / notes[i];

			if (count > 0) {
				System.out.println(notes[i] + "=" + count);
			}

			rupe = rupe % notes[i];
		}

	}

}
