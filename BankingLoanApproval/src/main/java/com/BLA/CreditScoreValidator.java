package com.BLA;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditScoreValidator implements LoanValidator {
    public boolean validateLoan(double amount) {
        System.out.println("Credit Score Validation Done");
        return true;
    }
}