package SpringSP;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UpiPayment implements PaymentService {

    private final TransactionLogger logger;

    public UpiPayment(TransactionLogger logger){
        this.logger = logger;
    }


    public void processPayment(double amount){
        logger.log("UPI payment: " + amount);
        System.out.println("Paid via UPI");
    }
}