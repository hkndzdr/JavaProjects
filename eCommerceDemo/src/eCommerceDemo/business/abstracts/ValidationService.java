package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface ValidationService {
	boolean validEmailCheckControl(User user);

	boolean emailNullCheckControl(User user);

	boolean validate(User user);

}
