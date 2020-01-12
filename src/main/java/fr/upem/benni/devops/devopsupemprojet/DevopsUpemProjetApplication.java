package fr.upem.benni.devops.devopsupemprojet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DevopsUpemProjetApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevopsUpemProjetApplication.class, args);
	}

}
