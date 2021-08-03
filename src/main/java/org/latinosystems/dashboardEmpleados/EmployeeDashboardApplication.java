package org.latinosystems.dashboardEmpleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDashboardApplication.class, args);
	}

}
