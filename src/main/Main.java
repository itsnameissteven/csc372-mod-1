package main;

public class Main {
	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("Steven", "Mancine", 6.7);
		checkingAccount.deposit(100);
		checkingAccount.deposit(200);
		checkingAccount.displayAccount();
		checkingAccount.processWithdrawal(500);
	}

}
