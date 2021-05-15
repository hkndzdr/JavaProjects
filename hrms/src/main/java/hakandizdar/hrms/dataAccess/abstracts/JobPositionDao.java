package hakandizdar.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hakandizdar.hrms.entities.concretes.JobPosition;

public interface JobPositionDao  extends JpaRepository<JobPosition, Integer>{

}
