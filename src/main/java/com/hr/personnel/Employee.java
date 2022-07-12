package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public abstract class Employee implements TaxPayer {
    private String name;
    private LocalDate localDate;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public abstract double computeMonthlyCompensation();

    public abstract String getEmployeeInfo();

    public String work() {
        return name + " worked";
    }

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
