package com.wright.bankaccount;


public class BankAccount {
	
	
	private Double checkingBalance = 0.0;
	private Double savingsBalance = 0.0;
	private long accountNumber;
	
	static int totalAccounts = 0;
	static double totalCashUnderManagement = 0.0;
	
	
	//default constructor      
	public BankAccount(double checkingBalance, double savingsBalance, long accountNumber) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		this.accountNumber = accountNumber;
		totalAccounts += 1;
		totalCashUnderManagement += (checkingBalance + savingsBalance);
	}
	
	
	//check balances all
	public void getBalanceAll() {
		System.out.println("Total Across All Accounts: " + (this.checkingBalance+this.savingsBalance));
		System.out.println("Account:" + this.accountNumber + " Checking Balance:" + this.checkingBalance + " Savings Balance:" + this.savingsBalance);
	}
	
	public void getSavings() {
		System.out.println("Savings Account Balance:" + this.savingsBalance);
	}
	
	public void getChecking() {
		System.out.println("Checking Account Balance:" + this.checkingBalance);
	}
	
	
	//move money in 
	public void depositIntoSavings(double deposit) {
		this.savingsBalance += deposit;
		System.out.println(this.savingsBalance);
		totalCashUnderManagement += deposit;
	}
	
	public void depositIntoChecking(double deposit) {
		this.checkingBalance += deposit;
		System.out.println(this.checkingBalance);
		totalCashUnderManagement += deposit;
	}
	
	//move money out (if you are not broke)
	public void withdrawFromSavings(double deposit) {
		if (this.savingsBalance >= deposit) {
			this.savingsBalance -= deposit;
			System.out.println(this.savingsBalance);
			totalCashUnderManagement -= deposit;
		} else {System.out.println("Insufficient funds");}
	}
	
	public void withdrawFromChecking(double deposit) {
		if (this.checkingBalance >= deposit) {
		this.checkingBalance -= deposit;
		System.out.println(this.checkingBalance);
		totalCashUnderManagement -= deposit;
		} else {System.out.println("Insufficient funds");}
	}


	public Double getCheckingBalance() {
		return checkingBalance;
	}


	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}


	public Double getSavingsBalance() {
		return savingsBalance;
	}


	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public static int getTotalAccounts() {
		return totalAccounts;
	}


	public static void setTotalAccounts(int totalAccounts) {
		BankAccount.totalAccounts = totalAccounts;
	}


	public static double getTotalCashUnderManagement() {
		return totalCashUnderManagement;
	}


	public static void setTotalCashUnderManagement(double totalCashUnderManagement) {
		BankAccount.totalCashUnderManagement = totalCashUnderManagement;
	}
	
	
	
	
}
