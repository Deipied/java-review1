package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {
    Department department = new Department("engineering", "seattle");
    private Employee employee;

    @Before
    public void setUp() {
        employee = new SalariedEmployee("kane", LocalDate.of(2020, 1, 3), 3000.0);
    }

    @Test
    public void addEmployee_should_add_employee_to_employees() {
        department.addEmployee(employee);
        Assert.assertEquals(department.getEmployees()[0], employee);
    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked_should() {
        department.addEmployee(employee);
        Assert.assertEquals(1,department.getCurrentIndex());
    }
}