package eCommerceDemo.core.utilities.adapters;

public class GoogleAuthManagerAdapter implements GoogleAuthService{
	@Override
	public void auth(String message) {
		System.out.println("Google ile doðrulama yapýldý");
	}
}
