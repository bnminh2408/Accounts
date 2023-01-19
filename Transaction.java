package accounts;

public class Transaction {

	private int id;
	private float amount;
	private char description;
	private Account withdrawalAccount;
	private Account paymentAccount;
	
	/**
	 * @param id
	 * @param amount
	 * @param description
	 * @param withdrawalAccount
	 * @param paymentAccount
	 */
	
	public Transaction(int id, float amount, char description, Account withdrawalAccount, Account paymentAccount) {
		this.id = id;
		this.amount = amount;
		this.description = description;
		this.withdrawalAccount = withdrawalAccount;
		this.paymentAccount = paymentAccount;
	}
	
	/*
	 * public Transaction(){}
	 * Wird später implementier
	 */
	
	public void printData() {
		System.out.println();
	}

	public float getAmount() {
		return amount;
	}
	
	
	
}
