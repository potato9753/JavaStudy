package com.app1_예외;

class Account{
	
	int balance = 1000;
	
	public void withdraw(int amt) throws Exception {
		if(balance>=amt) {
		balance -= amt;
		}else {
			throw new Exception("잔액이 부족합니다.");
		}
	}
}

public class ExceptionTest9 {

	public static void main(String[] args) {
			
		System.out.println("Start");
		
		Account acct = new Account();
		try {
			acct.withdraw(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println(acct.balance);
		
		
		
		System.out.println("End");
	}

}
