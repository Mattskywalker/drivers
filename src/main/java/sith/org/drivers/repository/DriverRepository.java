package sith.org.drivers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sith.org.drivers.models.Driver;

public interface DriverRepository extends JpaRepository <Driver, Long> {

}
