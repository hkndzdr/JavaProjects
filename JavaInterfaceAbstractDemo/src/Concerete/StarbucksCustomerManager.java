package Concerete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) throws Exception {
		if(this.customerCheckService.checkIfRealPerson(customer)) 
		{
			super.save(customer);
		}else {
			throw new Exception("Not a valid person");
		}
	
}

}
