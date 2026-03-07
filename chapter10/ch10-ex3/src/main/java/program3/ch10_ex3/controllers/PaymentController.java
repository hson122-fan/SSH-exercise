package program3.ch10_ex3.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import program3.ch10_ex3.exceptions.NotEnoughMoneyException;
import program3.ch10_ex3.models.ErrorDetails;
import program3.ch10_ex3.models.PaymentDetails;
import program3.ch10_ex3.services.PaymentService;

@RestController
public class PaymentController {
    
    private final PaymentService payService;
    
    public PaymentController(PaymentService paymentService){
        this.payService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(){
        PaymentDetails paymentDetails = this.payService.processPayment();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(paymentDetails);
    }
}