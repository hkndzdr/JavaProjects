package eCommerceDemo.business.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	void register( User user);
	void logIn(User user, String email, String password);
	User get(int id);
	List<User> getAll();
}
