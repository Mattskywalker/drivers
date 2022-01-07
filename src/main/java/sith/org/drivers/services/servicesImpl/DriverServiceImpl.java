package sith.org.drivers.services.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Service;
import sith.org.drivers.models.Driver;
import sith.org.drivers.repository.DriverRepository;
import sith.org.drivers.services.DriverService;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {


    @Autowired
    DriverRepository driverRepository;

    @Override
    public Driver getDriver(Long id) {
        return this.driverRepository.findById(id).get();
    }

    @Override
    public Driver saveDriver(Driver driver) {
        try{

            return this.driverRepository.save(driver);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<Driver> listDrivers() {


        System.out.println(this.driverRepository);
        List<Driver> drivers =  this.driverRepository.findAll();

        return drivers;
    }
}
