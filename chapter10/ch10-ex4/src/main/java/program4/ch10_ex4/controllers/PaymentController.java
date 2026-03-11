package program4.ch10_ex4.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import program4.ch10_ex4.models.PaymentDetails;
import program4.ch10_ex4.services.PaymentService;



@RestController
public class PaymentController {
    
    private final PaymentService payService;
    
    public PaymentController(PaymentService paymentService){
        this.payService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
        @RequestBody PaymentDetails paymentDetail
    ){
        this.payService.printDetail(paymentDetail);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(paymentDetail);
    }
}