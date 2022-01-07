package sith.org.drivers.services;

import sith.org.drivers.models.Driver;

import java.util.List;

public interface DriverService {

    public Driver getDriver(Long id);

    public Driver saveDriver(Driver driver);

    public List<Driver> listDrivers();
}
