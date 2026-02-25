package SpringSP;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TransactionLogger {

    @PostConstruct
    public void init(){
        System.out.println("Logger initialized");
    }

    public void log(String msg){
        System.out.println("LOG: " + msg);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Logger destroyed");
    }
}