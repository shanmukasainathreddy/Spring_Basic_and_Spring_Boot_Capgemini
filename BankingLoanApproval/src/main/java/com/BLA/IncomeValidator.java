package com.BLA;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("incomeValidator")
@Scope("prototype")
public class IncomeValidator implements LoanValidator {
    public boolean validateLoan(double amount) {
        System.out.println("Income Validation Done");
        return amount <= 500000;
    }
}