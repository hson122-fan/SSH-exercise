package program2.ch8_ex2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import program2.ch8_ex2.models.Product;
import program2.ch8_ex2.services.ProductService;

@Controller
public class ProductController {
    
    private final ProductService productService;

    public ProductController(ProductService ps){
        this.productService = ps;
    }

    @GetMapping("/products")
    public String viewProducts(Model page){
        var products = this.productService.findAll();
        page.addAttribute("products", products);

        return "products.html";
    }

    @PostMapping(path = "/products")
    public String addProduct(
            Product p,
            Model model){
        

        this.productService.addProduct(p);

        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }
        
}
