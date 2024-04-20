package main;
import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		try(Scanner scnr = new Scanner(System.in)){
			// Get information for bank account
			String firstName = getNameInput(scnr, true);
			String lastName = getNameInput(scnr, false);
			CheckingAccount checkingAccount = new CheckingAccount(firstName, lastName, 6.7);

			// Loop the program allowing the user to have multiple interactions.
			while (true) {		
				System.out.println("What would you like to do? Enter number.");
				System.out.println("1) Deposit money");
				System.out.println("2) Withdraw money");
				System.out.println("3) Display account information");
				System.out.println("4) Exit");
				
				try {
					int userInput = scnr.nextInt();
					switch(userInput) {
					case 1:
						depositMoney(scnr, checkingAccount);
						break;
					case 2: 
						withdrawMoney(scnr, checkingAccount);
						break;
					case 3: 
						checkingAccount.displayAccount();
						break;
					case 4:
						System.out.println("\n***************************");
						System.out.println("***************************");
						System.out.println("****  Exiting Program  ****");
						System.out.println("***************************");
						System.out.println("***************************");
						return;
					default: 
						System.out.println("Incorrect selection, please enter a number between 1-4\n");
					}		
				} catch(Exception e) {
					System.out.println("Incorrect selection, please enter a number between 1-4");
					scnr.next();
				}
				
			}
		}
	}

	// Prompts a user for first or last name and returns input
	public static String getNameInput(Scanner scnr, boolean isFirstName) {
		String nameType = isFirstName ? "first" : "last";
		while (true) {
			System.out.println("Enter your " + nameType  + " name: ");
			String userInput = scnr.nextLine();
			if(userInput.trim().length() == 0) {
				System.out.print("Please enter a " + nameType + " name to continue");
				scnr.next();
			} else {
				return userInput.trim();
			}
		}
	}
	
	
	public static void depositMoney(Scanner scnr, CheckingAccount checkingAccount) {
		try {
			System.out.println("How much would you like to deposit?");
			double amount = scnr.nextDouble();
			checkingAccount.deposit(amount);
		} catch (Exception e) {
			System.out.println("Incorrect format, please enter a number");
		}
	}
	
	public static void withdrawMoney(Scanner scnr, CheckingAccount checkingAccount) {
		try {
			System.out.println("How much would you like to withdraw?");
			double amount = scnr.nextDouble();
			checkingAccount.processWithdrawal(amount);
		} catch (Exception e) {
			System.out.println("Incorrect format, please enter a number");
		}
	}
	

}
