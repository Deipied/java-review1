package com.hr.corp;

import gov.irs.TaxPayer;

public class Corporation implements TaxPayer {
    private String name;
    private double monthlyIncome;


    @Override
    public double computeMonthlyTaxToPay() {
        return CORP_TAX_RATE * monthlyIncome;
    }
}
