package com.app3;

public class AccountTest {

	public static void main(String args[]) {

		Account account = new Account("441-0290-1203",500000,7.3);
		System.out.println(account);
		
		try {
			account.deposit(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			account.withdraw(600000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(account.calculateInterest());
	}
}
