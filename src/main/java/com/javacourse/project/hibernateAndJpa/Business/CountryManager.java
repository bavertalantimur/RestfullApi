package com.javacourse.project.hibernateAndJpa.Business;

import com.javacourse.project.hibernateAndJpa.DataAccess.ICountryDal;
import com.javacourse.project.hibernateAndJpa.Entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryManager implements ICountryManager {
    @Autowired
    private ICountryDal countryDal;
    public CountryManager(ICountryDal countryDal) {
        this.countryDal = countryDal;
    }



    @Override
    public Country addCountry(Country country) {
        return countryDal.addCountry(country);
    }

    @Override
    public String deleteCountry(Long id) {
        return countryDal.deleteCountry(id);
    }

    @Override
    public List<Country> getAllCountries() {
        return countryDal.getAllCountries();
    }

    @Override
    public Country getCountryById(Long id) {
        return countryDal.getCountryById(id);
    }
}
