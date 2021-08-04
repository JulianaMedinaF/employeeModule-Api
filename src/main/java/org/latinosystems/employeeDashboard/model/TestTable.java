package org.latinosystems.employeeDashboard.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "test_table")
public class TestTable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_table_sequence")
    @SequenceGenerator(name="test_table_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "description")
    private String description;

    //Variable transitoria.
    //No existe realmente en la BD.
    // Se muestra como una columna y realiza los calculos necesarios (calculo de fechas, etc)
    //Ver get
    @Transient
    private String falseColumn;

    public TestTable() {
    }

    public TestTable(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public TestTable(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFalseColumn() {
        LocalDate today = LocalDate.now();
        return today.toString();
    }

    public void setFalseColumn(String falseColumn) {
        this.falseColumn = falseColumn;
    }

    @Override
    public String toString() {
        return "TestTable{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", falseColumn='" + falseColumn + '\'' +
                '}';
    }
}
