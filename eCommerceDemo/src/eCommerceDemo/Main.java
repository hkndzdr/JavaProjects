package eCommerceDemo;


import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.ActivationManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.business.concretes.ValidationManager;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
	UserService userService = new UserManager(new ValidationManager(),new ActivationManager());
		
		User user1 = new User(1,"Hakan","Dizdar","hakandizdar@hotmail.com","123456");
		User user2 = new User(2,"Ali","Veli","veliiii@mail.com","989898");
		userService.register(user1);
		userService.register(user2);
	}
	
	
	}

