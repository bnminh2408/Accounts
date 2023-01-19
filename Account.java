package accounts;

import java.util.ArrayList;
import java.util.List;

abstract class Account {

	public static int counter = 0;
	private String number;
	protected Customer customer;
	private List<Transaction> negativeTransactions = new ArrayList<>();
	private List<Transaction> positiveTransactions = new ArrayList<>();

	public Account() {
		counter++;
		this.number = toString(counter);
		// andere Anweisungen wird später implementiert
	}

	public Account(Customer customer) {
		customer.addAccount(this);
	}

	public float getBalance() {
		float balance = 0.0f;

		for (Transaction transaction : negativeTransactions) {
			balance += transaction;
		}
		for (Transaction transaction : positiveTransactions) {
			balance += transaction;
		}
		return balance;
	}
}
