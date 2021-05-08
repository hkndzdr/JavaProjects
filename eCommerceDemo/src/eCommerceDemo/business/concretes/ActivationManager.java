package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.ActivationService;
import eCommerceDemo.entities.concretes.User;

public class ActivationManager implements ActivationService{

	@Override
	public boolean activeEmail(User user) {
		System.out.println("Hesabýnýz aktif edildi!");
		return true;
	}

	@Override
	public void sendActivationMail(User user) {
		System.out.println(user.getEmail() + " adresinize aktivasyon maili gönderildi!");
	}
}
