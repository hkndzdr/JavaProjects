package hakandizdar.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="verifications")
public class Verification {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="email_verification")
	private boolean emailVerification;
	
	public Verification(int id, boolean emailVerification) {
		super();
		this.id = id;
		this.emailVerification = emailVerification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEmailVerification() {
		return emailVerification;
	}

	public void setEmailVerification(boolean emailVerification) {
		this.emailVerification = emailVerification;
	}
	
	
}
