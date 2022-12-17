package com.javacourse.project.hibernateAndJpa.Business;

import com.javacourse.project.hibernateAndJpa.Entities.Country;

import java.util.List;

public interface ICountryManager {
    Country addCountry(Country country);
    String deleteCountry(Long id);
    List<Country> getAllCountries();
    Country getCountryById(Long id);
}
