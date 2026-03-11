package program1.ch11_payments.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import program1.ch11_payments.models.Payment;

@RestController
public class PaymentController {
    
    @PostMapping("/payment")
    public ResponseEntity<Payment> createPayment(
        @RequestHeader String requestId,
        @RequestBody Payment payment
    ){
        
        System.out.println("Service - Received Payment -> " + payment);
        payment.setId(UUID.randomUUID().toString());

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("requestId", requestId)
                .body(payment);
    }   
}
