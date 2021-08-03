package org.latinosystems.dashboardEmpleados;

import org.latinosystems.dashboardEmpleados.empleado.TestTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DashboardEmpleadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardEmpleadosApplication.class, args);
	}

}
