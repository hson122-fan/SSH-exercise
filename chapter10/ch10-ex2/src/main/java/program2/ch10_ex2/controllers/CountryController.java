package program2.ch10_ex2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import program2.ch10_ex2.models.Country;

@RestController
public class CountryController {
    
    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        Country c = Country.of("France", 67);
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "cheese and wine")
                .body(c);
    }
}
