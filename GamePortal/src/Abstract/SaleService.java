package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public interface SaleService {
	void sale(Customer customer, Product product);
	void discountSale(Customer customer, Product product, Campaign campaign);
}
