package hakandizdar.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers_verifications")
public class EmployerVerification {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="hrms_personel_verification")
	private boolean hrmsPersonelVerification;
	
	
	public EmployerVerification(int id, boolean hrmsPersonelVerification) {
		super();
		this.id = id;
		this.hrmsPersonelVerification = hrmsPersonelVerification;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isHrmsPersonelVerification() {
		return hrmsPersonelVerification;
	}


	public void setHrmsPersonelVerification(boolean hrmsPersonelVerification) {
		this.hrmsPersonelVerification = hrmsPersonelVerification;
	}
	
	

}
