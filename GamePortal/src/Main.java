import java.time.LocalDate;
import Adapters.FakeMernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.ProductManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"hkndzdr", "123456", "hakandizdar@gmail.com", "Hakan", "Dizdar", "1234567891234", LocalDate.of(1981, 12, 9));
		Customer customer2 = new Customer(1,"kadi","0101","aliveli@gmail.com","Ali", "Veli", "9898878714412", LocalDate.of(1991,1,1));
		
		CustomerManager customerManager=new CustomerManager(new FakeMernisServiceAdapter());
		customerManager.add(customer1);
		customerManager.add(customer2);

		//------------------
		
		Product product1 = new Product(1,"Oyun1","The Last Of Us", 600);
		Product product2 = new Product(2,"Oyun2","Uncharted", 500);
		Product product3 = new Product(1,"Oyun3","Jak & Daxter", 400);
		
		ProductManager productManager=new ProductManager();
		productManager.add(product1);
		productManager.add(product2);
		productManager.add(product3);
		
		SaleManager saleManager=new SaleManager();
		saleManager.sale(customer1, product1);
		
		//------------------
		
		Campaign campaign1 = new Campaign(1,"Ýndirim1","Efsane Cuma", 25);
		Campaign campaign2 = new Campaign(1,"Ýndirim2","Anneler Günü", 15);
		Campaign campaign3 = new Campaign(1,"Ýndirim3","Sevgililer Günü", 20);
		Campaign campaign4 = new Campaign(1,"Ýndirim4","Babalar Günü", 10);
			
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.add(campaign3);
		campaignManager.add(campaign4);
		
		campaignManager.update(campaign4);
		campaignManager.delete(campaign3);
		
		SaleManager saleManager2=new SaleManager();
		saleManager2.discountSale(customer1, product2, campaign1);
		saleManager2.discountSale(customer2, product2, campaign4);
		saleManager2.discountSale(customer1, product1, campaign2);
			
	}

}
