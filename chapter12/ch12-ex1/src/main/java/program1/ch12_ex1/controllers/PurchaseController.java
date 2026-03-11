package program1.ch12_ex1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import program1.ch12_ex1.models.Purchase;
import program1.ch12_ex1.repository.PurchaseRepository;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    
    private final PurchaseRepository repo;
    
    public PurchaseController(PurchaseRepository repo){
        this.repo = repo;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase){
        repo.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> findPurchase(){
        return repo.findAllPurchases();
    }

}
