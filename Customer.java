package accounts;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Account{
	private String number, title, firstName, lastName;
	private List<Address> addresses = new ArrayList<>();
	private List<Account> accounts = new ArrayList<>();
	
	
	/*
	 * public Customer() {}
	 * wird später implementiert
	 */
	
	public Customer(String number, String title, String firstName, String lastName, String street, 
			String zipCode, String city, String country) {
		this.number = number;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public float getAsset() {
		//float asset = getBalance();
		return getBalance(); //asset;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}
	
	
	
	public void addAddress(String street, String zipCode, String city, String country ) {
		Address adress = new Address(street, zipCode, city, country);
		addresses.add(adress);
	}
	

	
	
	
	

	
	
}
