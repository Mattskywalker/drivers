package sith.org.drivers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sith.org.drivers.models.Driver;
import sith.org.drivers.services.DriverService;
import sith.org.drivers.services.servicesImpl.DriverServiceImpl;

@SpringBootApplication
public class DriversApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriversApplication.class, args);

				//(String nome, String sorenome, String numero, String nacionalidade, String idade, String equipe)
	}

}
