package program4.ch10_ex4.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import program4.ch10_ex4.models.ErrorDetails;



@RestControllerAdvice
public class ExceptionControllerAdvice {
    
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(NotEnoughMoneyException e){
        ErrorDetails error = new ErrorDetails();
        error.setMessage("u broke homie, from advice, " + e.getMessage());
        return ResponseEntity
                .badRequest()
                .body(error);
    }
}
