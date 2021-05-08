package eCommerceDemo.business.concretes;

import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.ValidationService;
import eCommerceDemo.entities.concretes.User;

public class ValidationManager implements ValidationService{

	private static final String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	private static Pattern validRegPattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	
	public boolean validEmailCheckControl(User user) {
		if (!user.getEmail().isEmpty()) {
			return validRegPattern.matcher(user.getEmail()).find();
		}
		return false;
	}

	public boolean emailNullCheckControl(User user) {
		if (!user.getEmail().isEmpty() && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validate(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Parola bilgisi için en az 6 karakter giriniz!");
			return false;
		}
		
		if (user.getFirstName().length() < 2) {
			System.out.println("Ad bilgisi için  en az 2 karakter giriniz!");
			return false;
		}
		
		if (user.getLastName().length() < 2) {
			System.out.println("Soyad bilgisi için en az 2 karakter giriniz!");
			return false;
		}
		

		if (validEmailCheckControl(user) && user.getPassword().length() >= 6 && user.getFirstName().length() >=2 	&& user.getLastName().length() >= 2 && emailNullCheckControl(user)) {
			System.out.println("Kullanýcý bilgileri doðrulandý!");
			return true;
		} else {	
			return false;
		}

	}

}
