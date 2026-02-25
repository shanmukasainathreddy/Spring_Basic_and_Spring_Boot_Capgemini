package com.BLA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LoanService {

    private LoanValidator validator;
    private AuditService auditService;

    @Autowired
    public LoanService(@Qualifier("incomeValidator") LoanValidator validator) {
        this.validator = validator;
    }

    @Autowired
    public void setAuditService(AuditService auditService) {
        this.auditService = auditService;
    }

    public void applyLoan(double amount) {
        if (validator.validateLoan(amount)) {
            auditService.audit("Loan Approved: ₹" + amount);
        } else {
            auditService.audit("Loan Rejected: ₹" + amount);
        }
    }
}
