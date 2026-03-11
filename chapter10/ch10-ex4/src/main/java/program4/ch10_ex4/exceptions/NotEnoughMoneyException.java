package program4.ch10_ex4.exceptions;

public class NotEnoughMoneyException extends RuntimeException{
    private String message;

    public NotEnoughMoneyException(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}