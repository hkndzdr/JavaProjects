package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface ActivationService {
	boolean activeEmail(User user);
	void sendActivationMail(User user);

}
