package com.javacourse.project.hibernateAndJpa.DataAccess;

import com.javacourse.project.hibernateAndJpa.Entities.Country;
import com.javacourse.project.hibernateAndJpa.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CountryDal implements ICountryDal{
    @Autowired
    private CountryRepository countryRepository;

    CountryDal(CountryRepository countryRepository){
        this.countryRepository=countryRepository;
    }

    @Override
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public String deleteCountry(Long id) {
         countryRepository.deleteById(id);
         return "başarılı silindi";
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountryById(Long id) {
        return countryRepository.findById(id).orElse(null);
    }
}
