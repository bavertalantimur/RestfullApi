package com.javacourse.project.hibernateAndJpa.DataAccess;
import com.javacourse.project.hibernateAndJpa.Entities.City;
import org.springframework.stereotype.Repository;


import java.util.List;


public interface ICityDal {

    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(int  id);
    City getByID(int id);
    City updateCityNameById(int id,String name);

}
