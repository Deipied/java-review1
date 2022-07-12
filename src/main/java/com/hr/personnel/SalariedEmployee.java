package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate localDate, double monthlySalary) {
        setName(name);
        setLocalDate(localDate);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return SALARIED_TAX_RATE * monthlySalary;
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    @Override
    public String getEmployeeInfo() {
        return "name = " + getName() + " hireDate = " + getLocalDate() + " monthlySalary = " + getMonthlySalary();
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
