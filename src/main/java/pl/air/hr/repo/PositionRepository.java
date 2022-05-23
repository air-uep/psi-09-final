package pl.air.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.air.hr.model.*;

public interface PositionRepository extends JpaRepository<Position, Long> {

}
