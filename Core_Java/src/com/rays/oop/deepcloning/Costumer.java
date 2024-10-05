
package com.rays.oop.deepcloning;

public class Costumer implements Cloneable {

	public String name;

	public Account no;

	public Costumer(String name) {
		this.name = name;
		no = new Account(100);

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Costumer c = (Costumer) super.clone();  // Step 1: Shallow clone of the `Costumer`
		c.no = (Account) no.clone();            // Step 2: Deep clone of the `Account`

		return c;
	}

}
