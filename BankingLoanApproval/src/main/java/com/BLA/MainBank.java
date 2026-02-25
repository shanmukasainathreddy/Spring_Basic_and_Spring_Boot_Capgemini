package com.BLA;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBank{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Bank.class);

        LoanService loanService = ctx.getBean(LoanService.class);
        loanService.applyLoan(400000);

        ctx.close();
    }
}
