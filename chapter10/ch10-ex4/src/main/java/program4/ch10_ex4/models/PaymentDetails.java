package program4.ch10_ex4.models;

public class PaymentDetails {
    private double amount;

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }

    @Override
    public String toString(){
        return "amount: " + this.amount;
    }
}
