package program2.ch8_ex2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import program2.ch8_ex2.models.Product;

@Service
public class ProductService {
    private List<Product> products;

    public ProductService(){
        this.products  = new ArrayList<>(); 
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public List<Product> findAll(){
        return this.products;
    }


}