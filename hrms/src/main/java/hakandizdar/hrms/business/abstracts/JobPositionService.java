package hakandizdar.hrms.business.abstracts;

import java.util.List;

import hakandizdar.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
