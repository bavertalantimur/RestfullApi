package com.javacourse.project.hibernateAndJpa.restApi;

import com.javacourse.project.hibernateAndJpa.Business.ICountryManager;
import com.javacourse.project.hibernateAndJpa.Entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    private ICountryManager countrymanager;
    @Autowired
    public CountryController(ICountryManager countrymanager) {
        this.countrymanager = countrymanager;
    }
    @PostMapping ("/add")
    public Country addCountry(@RequestBody Country country){
        return countrymanager.addCountry(country);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        countrymanager.deleteCountry(id);
        return "başarılı silindi";
    }

    @GetMapping("/all")
    public List<Country> getAllCountries(){
        return countrymanager.getAllCountries();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable Long id){
         return ResponseEntity.status(200).body(countrymanager.getCountryById(id));
    }



}
