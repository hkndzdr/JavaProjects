package Adapters;

import Abstract.ValidationService;
import Entities.Customer;

public class FakeMernisServiceAdapter implements ValidationService {

	@Override
	public boolean validate(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli kiþinin kimlik bilgileri doðrulandý!");
		return true;
	}
}
