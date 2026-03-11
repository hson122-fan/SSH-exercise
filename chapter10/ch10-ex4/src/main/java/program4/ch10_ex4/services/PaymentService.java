package program4.ch10_ex4.services;

import org.springframework.stereotype.Service;

import program4.ch10_ex4.exceptions.NotEnoughMoneyException;
import program4.ch10_ex4.models.PaymentDetails;



@Service
public class PaymentService {
    
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException("from parameter");
    }

    public void printDetail(PaymentDetails details){
        System.out.println("Received detail-> " + details);
    }
}
