package Entities;
import java.time.LocalDate;

public class Customer extends User{
	
	private String firstName;
	private String lastName;
	private String identityNumber;
	private LocalDate birthDate;
	
	
	public Customer(int id, String userName, String password, String email, String firstName, String lastName,
			String identityNumber, LocalDate birthDate) {
		super(id, userName, password, email);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIdentityNumber() {
		return identityNumber;
	}


	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	
	

}
