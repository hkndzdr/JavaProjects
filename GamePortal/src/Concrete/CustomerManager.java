package Concrete;

import Abstract.CustomerService;
import Abstract.ValidationService;
import Entities.Customer;

public class CustomerManager implements CustomerService{
	
	private ValidationService validationService;
	
	

	public CustomerManager(ValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public void add(Customer customer) {
		if(validationService.validate(customer)) {
			System.out.println(customer.getEmail() + " email adresli kullanýcý oluþturuldu!");
		}else {
			System.out.println("Kimlik doðrulama hatasý!");
		}
		
	}

	@Override
	public void update(Customer customer) {
		if(validationService.validate(customer)) {
			System.out.println(customer.getEmail() + " email adresli kullanýcý güncellendi!");
		}else {
			System.out.println("Kimlik doðrulama hatasý!");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getEmail() + " email adresli kullanýcý silindi!");
		
	}

}
