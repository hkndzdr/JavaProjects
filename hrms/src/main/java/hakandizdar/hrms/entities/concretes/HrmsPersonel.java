package hakandizdar.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hrms_personels")
public class HrmsPersonel {
	@Id
	@GeneratedValue
	@Column(name="hrms_personel_id")
	private int hrmsPersonelId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	public HrmsPersonel(int hrmsPersonelId, String firstName, String lastName) {
		super();
		this.hrmsPersonelId = hrmsPersonelId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getHrmsPersonelId() {
		return hrmsPersonelId;
	}

	public void setHrmsPersonelId(int hrmsPersonelId) {
		this.hrmsPersonelId = hrmsPersonelId;
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
	
	

}
