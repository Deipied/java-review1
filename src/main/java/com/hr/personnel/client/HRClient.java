package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("Hoon", LocalDate.of(2020, 4, 20), 3000.0);
        SalariedEmployee employee2 = new SalariedEmployee("bob", LocalDate.of(2020, 4, 21), 3000.0);
        HourlyEmployee employee3 = new HourlyEmployee("Sang", LocalDate.of(2020,4,22), 20 ,10.0);

        String employeeInfo1 = employee1.getEmployeeInfo();
        System.out.println(employeeInfo1);
        String employeeInfo2 = employee2.getEmployeeInfo();
        System.out.println(employeeInfo2);
        String employeeInfo3 = employee3.getEmployeeInfo();
        System.out.println(employeeInfo3);

        Department department = new Department("HR", "amazon");

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        int step = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println(step);

        double totalDepartmentMonthlyCompensation = department.computeDepartmentMonthlyTotalCompensation();
        System.out.println("The total monthly compensation for this department is " + totalDepartmentMonthlyCompensation);

    }
}
