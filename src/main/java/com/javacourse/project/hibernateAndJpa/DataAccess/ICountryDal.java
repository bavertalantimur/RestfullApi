package com.javacourse.project.hibernateAndJpa.DataAccess;

import com.javacourse.project.hibernateAndJpa.Entities.Country;

import java.util.List;

public interface ICountryDal {
    Country addCountry(Country country);
    String deleteCountry(Long id);
    List<Country> getAllCountries();
    Country getCountryById(Long id);

}
