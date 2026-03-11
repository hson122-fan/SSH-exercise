package program2.ch11_ex1.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import program2.ch11_ex1.models.Payment;
import program2.ch11_ex1.proxy.PaymentsProxy;

@RestController
public class PaymentController {
    
    private final PaymentsProxy paymentsProxy;

    public PaymentController(PaymentsProxy paymentsProxy){
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
        @RequestBody Payment payment
    ){
        System.out.println("App - Received Payment -> " + payment);
        String requestId = UUID.randomUUID().toString();
        return paymentsProxy.createPayment(requestId, payment);
    }
}
