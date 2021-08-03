package org.latinosystems.dashboardEmpleados.empleado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestTableRepository extends JpaRepository<TestTable, Long> {

    //Business Logic
    //En esta capa se va a crear la condición a validar para poder guardar un dato
    //Se puede dejar unicamente asi o se puede aplicar un @Query para hacer la condición aun mas especifica de ser necesario
    @Query("SELECT t FROM TestTable t WHERE t.description = ?1")
    Optional<TestTable> findTestTableByDescription(String description);
}
