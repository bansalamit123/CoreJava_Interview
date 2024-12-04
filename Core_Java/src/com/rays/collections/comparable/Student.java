
package com.rays.collections.comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {

		//if (this.id == o.id) {
			 if(this.name .equals(o.name)){

			//return this.name.compareTo(o.name);  
			 return this.id - o.id; //ascending order. if you want descending order of element  then reverse condition 
			/*
			 * It first checks if the names of both Student objects are equal. If they are
			 * equal, the comparison is done based on their IDs. Specifically, it subtracts
			 * o.id from this.id, which ensures that students with the same name are sorted
			 * based on their IDs in ascending order.
			 */
		} else {
			// System.out.println("amit");
			// //If the names are not equal, it compares
			// the names alphabetically
			// This means that the list will be sorted by name first. If two names are
			// identical, it will then sort by ID.
			
			 return this.name.compareTo(o.name); //ascending order. if you want descending order of element  then reverse condition 
			 
			//return this.id - o.id;  //ascending order. if you want descending order of element  then reverse condition 

		}
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

	/*
	 * If this.id - o.id results in: A negative number: this.id is smaller than
	 * o.id. In sorting, this means that this should come before o. Zero: Both
	 * this.id and o.id are equal. In sorting, they are considered equal. A positive
	 * number: this.id is greater than o.id. In sorting, this means that this should
	 * come after o.
	 */

	/*
	 * 3. compareTo() Method: this.name.compareTo(o.name) is a call to the
	 * compareTo() method from the String class. The compareTo() method is used to
	 * compare two strings lexicographically (alphabetical order). How
	 * String.compareTo() Works: The compareTo method of the String class compares
	 * two strings character by character using the Unicode values of the
	 * characters. It returns: A negative value if the calling string (this.name)
	 * comes before the passed string (o.name) alphabetically. Zero if both strings
	 * are equal. A positive value if the calling string (this.name) comes after the
	 * passed string (o.name) alphabetically.
	 */
}
