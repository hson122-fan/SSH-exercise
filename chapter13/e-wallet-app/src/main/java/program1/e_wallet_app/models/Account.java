package program1.e_wallet_app.models;

import java.math.BigDecimal;

public class Account {

    private Long id;
    private String name;
    private BigDecimal amount;

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public BigDecimal getAmount(){
        return amount;
    }
    
}
