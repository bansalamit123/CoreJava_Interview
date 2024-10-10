
package com.rays.oop;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(int amt) {

//		System.out.println("Total balance" + balance);
//		System.out.println("Deposite Amt" + amt);
		balance = balance + amt;
		System.out.println("After Deposite Amt" + balance);
	}

	public void withdrawal(int amt) {

		if ((balance - 2000) < amt) {
			System.out.println("low balance");
		} else {

			System.out.println("Total balance" + balance);
			System.out.println("Withdrawl Amt" + amt);
			balance = balance - amt;
			System.out.println("After Withdrawl Amt" + balance);
		}
	}

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setBalance(2000);
		ac.deposite(500);
		ac.withdrawal(100);
	}

}
