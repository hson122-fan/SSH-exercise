package program3.ch10_ex3.services;

import org.springframework.stereotype.Service;

import program3.ch10_ex3.exceptions.NotEnoughMoneyException;
import program3.ch10_ex3.models.PaymentDetails;


@Service
public class PaymentService {
    
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException("from parameter");
    }
}
