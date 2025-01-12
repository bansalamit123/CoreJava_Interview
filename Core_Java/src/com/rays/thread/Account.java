
package com.rays.thread;

public class Account {

	private int balance ;

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	
	public  void deposite(String name, int amt) {
//synchronized
		int total = getBalance() + amt;

		setBalance(total);

		System.out.println(name + " " + getBalance());

	}

}
