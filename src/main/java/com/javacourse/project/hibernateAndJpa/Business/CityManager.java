package com.javacourse.project.hibernateAndJpa.Business;

import com.javacourse.project.hibernateAndJpa.DataAccess.ICityDal;
import com.javacourse.project.hibernateAndJpa.Entities.City;
import jakarta.annotation.Resource;
import jakarta.annotation.Resources;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityManager implements ICityService{

    @Autowired
    private ICityDal cityDal;



    @Override
    @Transactional
    public List<City> getAll() {
        return this.cityDal.getAll();
    }

    @Override
    @Transactional
    public void add(City city) {
        cityDal.add(city);
    }

    @Override
    @Transactional
    public void update(City city) {
        this.cityDal.update(city);

    }

    @Override
    @Transactional
    public void delete(int id) {
        cityDal.delete(id);
    }

    @Override
    public City getById(int id) {
        return cityDal.getByID(id);
    }

    @Override
    public City updateCityNameById(int id, String name) {
        return cityDal.updateCityNameById(id,name);
    }
}
