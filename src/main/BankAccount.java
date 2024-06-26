package main;
import java.text.NumberFormat;
import java.util.Random;

public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	BankAccount(String firstName, String lastName) {
		Random random = new Random();
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = 0.0;
		// Generate random 9 digit int for account id
		this.accountID = 100000000 + random.nextInt(900000000);
	}
	
	// Getters
	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
	public int getAccountID() { return this.accountID; }
	public double getBalance() { return this.balance; }
	
	// Setters
	public void setFirstName(String firstName) { 
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAccountId(int accountID) {
		this.accountID = accountID;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// Methods 
	// Will deposit if amount greater than 0 is provided.
	public void deposit(double amount) throws InvalidInputException {
		if(amount <= 0.0) {
			throw new InvalidInputException("Deposit amount must be greater than 0.");
		}
		this.balance += amount;
		System.out.println("Your account balance is now " + NumberFormat.getCurrencyInstance().format(this.balance));
	}
	
	// Will withdraw if a balance greater than 0 is provided.
	public void withdrawal(double amount) throws InvalidInputException {
		if(amount <= 0.0) {
			throw new InvalidInputException("Withdrawal amount must be greater than 0");
		}
		this.balance -= amount;
		System.out.println("Your account balance is now " + NumberFormat.getCurrencyInstance().format(this.balance) );
	}
	
	// Prints all account information
	public void accountSummary() {
		System.out.println("AccountId: " + this.accountID);
		System.out.println("First name: " + this.firstName);
		System.out.println("Last name: " + this.lastName);
		System.out.println("Balance: " + NumberFormat.getCurrencyInstance().format(this.balance));
	}
}
