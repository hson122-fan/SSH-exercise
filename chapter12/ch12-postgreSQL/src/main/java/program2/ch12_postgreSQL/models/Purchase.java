package program2.ch12_postgreSQL.models;

import java.math.BigDecimal;

public class Purchase{
    private Integer id;
    private String product;
    private BigDecimal price;


    public int getId(){
        return this.id;
    }

    public String getProduct(){
        return this.product;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    public void setId(Integer int1) {
        this.id = int1;
    }

    public void setProduct(String string) {
        this.product = string;
    }

    public void setPrice(BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }
}