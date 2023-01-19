package accounts;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
	
	public static int counter = 0;
	private String number;
	protected Customer customer;
	private List<Transaction> negativeTransactions = new ArrayList<>();
	private List<Transaction> positiveTransactions = new ArrayList<>();
	
	public Account() {
		counter++;
		int number = counter;
		//andere Anweisungen wird später implementiert
	}
	
//	public Account(Customer customer) {
//		
//		customer.addAccount
//	}

	public float getBalance() {
		float balance;
		balance = balance + transaction.
	}
}
