package com.app3;

import javax.security.auth.login.AccountException;

public class Account {
	
	private String account;
	private double balance;
	private double interestRate;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String account, double balance, double interestRate) {
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return this.balance * this.interestRate*0.01; 
	}
	
	@Override
	public String toString() {
		return "계좌정보 " +"\t"+ account +"\t"+ balance +"\t"+  interestRate;
	}
	
	public void deposit(double money) throws AccountException {
		if(money<0) {
			throw new AccountException("입금 금액이 0보다 적습니다.");
		}else {
			this.balance += money;
		}
		
	}
	
	public void withdraw(double money) throws AccountException {
			if(this.balance >= money) {
				this.balance -= money;
			}else {
				throw new AccountException("금액이 0보다 적거나 현재 잔액보다 많습니다.");
			}	
	}
	
}
