package org.launchcode.javawebdevtechjobspersistent;

import org.launchcode.javawebdevtechjobspersistent.controllers.EmployerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("EmployerController")
@SpringBootApplication
public class JavaWebDevTechjobsPersistentApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaWebDevTechjobsPersistentApplication.class, args);
	}

}
