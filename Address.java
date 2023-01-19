package accounts;

public class Address {
	private String street, zipCode, city, country;

	/**
	 * @param street
	 * @param zipCode
	 * @param city
	 * @param country
	 */
	public Address(String street, String zipCode, String city, String country) {
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}
	
	public String printAddress() {
		System.out.println(getStreet() + " " + getZipCode() + " " + getCity() + " " + getCountry());
		return null;
	}
	
	
}
