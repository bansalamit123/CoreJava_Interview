package com.rays.exception;

public class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amt) {
		balance =balance+amt;
		//System.out.println(balnc);
	}

	public double withdraw(double amt) throws BankException {
		
		if ((balance-2000) < amt) {
			BankException e = new BankException("Amount is less than 2000.....");
			throw e;
		}else {
			balance = balance - amt;
		}
		return balance;
	}
}