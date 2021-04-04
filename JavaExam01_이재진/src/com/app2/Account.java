package com.app2;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		
	}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//이자는 현재금액 * 이자율
	public double calculateInterest() {
		
		return balance * interestRate;
	}
	
	//입금 시 현재 금액에 금액 추가
	public void deposit(int money) {
		this.balance += money;
	}
	
	//잔고보다 큰 금액을 출금할 때에는 알림 출력 및 출금 시 잔액 감소
	public void withdraw(int money) {
		if(this.balance - money <0) {
			System.out.println("출금 할 수 없습니다.");
		}
		else {
			this.balance -= money;
		}
	}
	
}
