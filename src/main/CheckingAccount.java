package main;

public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	// Extend superclass and add interest rate to instantiation.
	CheckingAccount(String firstName, String lastName, double interestRate) {
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
	// Withdraw fee of 30 if account is less than 0.
	public void processWithdrawal(double amount) throws InvalidInputException {
		if(amount > getBalance()) {
			System.out.println("Overdraft fee charged -- $30");
			withdrawal(amount + 30);
		} else {
			withdrawal(amount);
		}
	}
	
	// Extend superclass display adding the interest rate
	public void displayAccount() {
		accountSummary();
		System.out.println("Interest rate: " + getInterestRate() +"%");
	}

}
