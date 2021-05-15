package hakandizdar.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employer {
	@Id
	@GeneratedValue
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="website_address")
	private String websiteAdress;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	public Employer(int employerId, String companyName, String websiteAdress, String phoneNumber) {
		super();
		this.employerId = employerId;
		this.companyName = companyName;
		this.websiteAdress = websiteAdress;
		this.phoneNumber = phoneNumber;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsiteAdress() {
		return websiteAdress;
	}

	public void setWebsiteAdress(String websiteAdress) {
		this.websiteAdress = websiteAdress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
