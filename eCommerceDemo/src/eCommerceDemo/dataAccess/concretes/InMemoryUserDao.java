package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	private List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+" "+user.getLastName() + " kullanýcýsý eklendi!");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " kullanýcýsý güncelledi!");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " kullanýcýsý silindi!");
		
	}

	@Override
	public User get(int id) {
		User user = users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		return user;
	}

	@Override
	public List<User> getAll() {
		for (User user : users) {
			System.out.println(user.getFirstName());
		}
		return this.users;
	}

	@Override
	public User getEmail(String mail) {
		User user = users.stream().filter(u -> u.getEmail() == mail).findFirst().orElse(null);
		return user;
	}

}
