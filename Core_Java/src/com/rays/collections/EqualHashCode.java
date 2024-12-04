
 package com.rays.collections;

public class EqualHashCode {
	int id;
	String name;
	int salary;

	public EqualHashCode(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// hashcode will not apply in primitive data type
	/*
	 * The hashCode() method generates a unique integer based on the object's
	 * contents. If two objects are logically equal (i.e., their equals() method
	 * returns true), they must return the same hash code.
	 */
	@Override
	public int hashCode() {
		String s = this.id + this.name + this.salary;
		//System.out.println(s);
		return s.hashCode();
	}
	
	/*
	 * Explanation: Even though e1 and e2 are different objects, the equals() method
	 * compares their id, name, and salary. Since these values are the same for both
	 * objects, equals() returns true.
	 */

	
	//Override the equals(Object obj) method in your class to define custom equality logic based on relevant fields of the object.
	@Override
	public boolean equals(Object obj) {
		

		if (obj == null) {
			return false;
		}
		if (!(obj instanceof EqualHashCode)) {
			return false;
		
		}
		EqualHashCode e = (EqualHashCode) obj;
		String st = this.id + this.name + this.salary;
		String st1 = e.id + e.name + e.salary;
      
		return st.equals(st1);
		
		//return this.id.equals(e.id) && this.name.equals(e.name) && this.salary == e.salary; more efficient than string

	}
	//Override the toString() method in your class to return a meaningful string representation of the object's state.
	@Override
	public String toString() {
		String s = this.id + " " + this.name + " " + this.salary;
		return s;
	}
}
