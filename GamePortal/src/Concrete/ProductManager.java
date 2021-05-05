package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService{

	@Override
	public void add(Product product) {
		System.out.println(product.getName() + " oyunu eklendi!");	
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName() + " oyunu güncellendi!");
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName() + " oyunu silindi!");
	}

}
