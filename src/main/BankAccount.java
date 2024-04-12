package main;
import java.util.Random;

public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	public BankAccount(String firstName, String lastName) {
		Random random = new Random();
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = 0.0;
		// Generate random 9 digit int
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
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// Methods 
	public void deposit(double amount) {
		if(amount <= 0.0) {
			System.out.println("Deposit amount must be greater than 0.");
			return;
		}
		this.balance += amount;
		System.out.println("Your account balance is now $" + this.balance);
	}
	
	public void withdrawal(double amount) {
		if(amount <= 0.0) {
			System.out.println("Withdrawal amount must be greater than 0");
			return;
		}
		this.balance -= amount;
		System.out.println("Your account balance is now $" + this.balance);
	}
	
	public void accountSummary() {
		System.out.println("AccountId: " + this.accountID);
		System.out.println("First name: " + this.firstName);
		System.out.println("Last name: " + this.lastName);
		System.out.println("Balance: " + this.balance);
	}
}
