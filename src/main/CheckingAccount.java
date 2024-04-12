package main;

public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	public CheckingAccount(String firstName, String lastName, double interestRate) {
		super(firstName, lastName);
		this.interestRate = interestRate;
	}
	
	// Getters
	public double getInterestRate() { return this.interestRate; };
	
	// Setters 
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	// Methods
	public void processWithdrawal(double amount) {
		if(amount > getBalance()) {
			System.out.println("Overdraft fee charged -- $30");
			withdrawal(amount + 30);
		} else {
			withdrawal(amount);
		}
	}
	
	public void displayAccount() {
		accountSummary();
		System.out.println("Interest rate: " + this.interestRate);
	}

}
