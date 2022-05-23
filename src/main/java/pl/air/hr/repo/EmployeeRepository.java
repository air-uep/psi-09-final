package pl.air.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.air.hr.model.*;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
