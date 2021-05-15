package hakandizdar.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_seekers_verifications")
public class JobSeekerVerification {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="mernis_verification")
	private boolean mernisVerification;
	
	public JobSeekerVerification(int id, boolean mernisVerification) {
		super();
		this.id = id;
		this.mernisVerification = mernisVerification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isMernisVerification() {
		return mernisVerification;
	}

	public void setMernisVerification(boolean mernisVerification) {
		this.mernisVerification = mernisVerification;
	}
	
	

}
