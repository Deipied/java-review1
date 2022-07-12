package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    public int hoursWorkedPerMonth;
    public double hourlyRate;

    @Override
    public double computeMonthlyTaxToPay() {
        return HOURLY_TAX_RATE * computeMonthlyCompensation();
    }

    @Override
    public String getEmployeeInfo(){
        return "name = " + getName() + " hireDate = " + getLocalDate() + " hourlyRate = " +getHourlyRate() + " hoursWorkedPerMonth = " +getHoursWorkedPerMonth();
    }

    @Override
    public double computeMonthlyCompensation() {
        return hoursWorkedPerMonth * hourlyRate;
    }

    public HourlyEmployee(String name, LocalDate localDate, int hoursWorkedPerMonth, double hourlyRate) {
        setName(name);
        setLocalDate(localDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
