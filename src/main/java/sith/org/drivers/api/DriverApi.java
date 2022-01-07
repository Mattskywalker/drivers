package sith.org.drivers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sith.org.drivers.models.Driver;
import sith.org.drivers.services.DriverService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverApi {

    @Autowired
    DriverService driverService;

    @PostMapping("/driver")
    public ResponseEntity<Driver> save(@RequestBody Driver driver){
        try{
            driver.setCreatedAt(new Date());
            driver.setUpdatedAt(new Date());
            return new ResponseEntity<Driver>(this.driverService.saveDriver(driver), HttpStatus.OK);

        }catch (Exception e) { //tolerancia a falhas;

            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @GetMapping("/driver/all")
    public ResponseEntity<List<Driver>> getDriver() {
        try{
            List<Driver> driverList = this.driverService.listDrivers();
            return new ResponseEntity<List<Driver>>( driverList, HttpStatus.OK);
        }catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/driver/{id}")
    public void findById(@PathVariable Long id){
        try{
            Driver driver = driverService.getDriver(id);
            System.out.println(driver.getNome());

        }catch (Exception e) {

        }
    }
}
