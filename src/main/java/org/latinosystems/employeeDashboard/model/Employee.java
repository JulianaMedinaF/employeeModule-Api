package org.latinosystems.employeeDashboard.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence")
    @SequenceGenerator(name="employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "address")
    private String address;

    @Column(name = "telephone_number")
    private String telephone_number;

    @Column(name = "hiring_date")
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date hiring_date;

    @Column(name = "type_employee")
    private String type_employee;

    @Column(name = "date_birth")
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date date_birth;

    public Employee() {
    }

    public Employee(String first_name, String last_name, String address, String telephone_number, Date hiring_date, String type_employee, Date date_birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.telephone_number = telephone_number;
        this.hiring_date = hiring_date;
        this.type_employee = type_employee;
        this.date_birth = date_birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public Date getHiring_date() {
        return hiring_date;
    }

    public void setHiring_date(Date hiring_date) {
        this.hiring_date = hiring_date;
    }

    public String getType_employee() {
        return type_employee;
    }

    public void setType_employee(String type_employee) {
        this.type_employee = type_employee;
    }

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date date_birth) {
        this.date_birth = date_birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", telephone_number='" + telephone_number + '\'' +
                ", hiring_date=" + hiring_date +
                ", type_employee='" + type_employee + '\'' +
                ", date_birth=" + date_birth +
                '}';
    }
}
