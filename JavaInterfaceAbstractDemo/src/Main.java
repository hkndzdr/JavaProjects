

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concerete.CustomerCheckManager;
import Concerete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1,"Hakan","Dizdar", LocalDate.of(1981,12,9),"24943835840"));
	}

}
