package program1.ch11_payments.models;

public class Payment {
    private String id;
    private double amount;

    public void setId(String id){
        this.id = id;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getId(){
        return id;
    }

    public double getAmount(){
        return amount;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Amount: " + amount;
    }
}
