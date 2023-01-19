package accounts;

import java.util.ArrayList;
import java.util.List;

public class AccountsTest {
	public static void main(String[] args) {
		
		Customer cus = new Customer("21", "lj", "gg", "fjdgj", "21", "lj", "gg", "fjdgj");
		List<Address> minh = new ArrayList<>();
		Address a = new Address("21", "lj", "gg", "fjdgj");
		minh.add(a);
		System.out.println(cus.getAddresses().get(5).getCity());
//		Customer cus = new Customer(null, null, null, null, null, null, null, null);
//		cus.addAddress("21", "lj", "gg", "fjdgj");
//		System.out.println(cus.getAddresses());
	}
}
