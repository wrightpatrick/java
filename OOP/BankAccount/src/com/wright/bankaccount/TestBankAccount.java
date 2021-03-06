package com.wright.bankaccount;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		BankAccount account1 = new BankAccount(1000.00, 10000.00, 1111111111);
		BankAccount account2 = new BankAccount(500.00, 2000.00, 222222222);
		System.out.println("Checking Balance " + account1.getCheckingBalance());
		
		
		
		account1.depositIntoChecking(543.00);
		account2.depositIntoChecking(335.00);
		
		account1.depositIntoSavings(23412.00);
		account2.depositIntoSavings(23423.00);
		
		account1.withdrawFromChecking(213234234.00);
		account1.withdrawFromChecking(123.00);
		
		account2.withdrawFromChecking(213234234.00);
		account2.withdrawFromChecking(123.00);

		System.out.println("Total number of Accounts:" + BankAccount.totalAccounts);
		System.out.println("Total Assets Under Management " + BankAccount.totalCashUnderManagement);

		account2.getBalanceAll();
		account1.getBalanceAll();
	
		account1.getSavingsBalance();
		account1.getCheckingBalance();
		
		account2.getSavingsBalance();
		account2.getCheckingBalance();
		
	}

}
