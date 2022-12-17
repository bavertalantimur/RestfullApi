package com.javacourse.project.hibernateAndJpa.DataAccess;

import com.javacourse.project.hibernateAndJpa.Entities.City;
import com.javacourse.project.hibernateAndJpa.repository.CityRepository;
import jakarta.persistence.EntityManager;

import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.EntityManagerHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateCityDal implements ICityDal {

    private EntityManager entityManager;

    private CityRepository repository;
    @Autowired
    public HibernateCityDal(EntityManager entityManager,CityRepository repository) {
        this.entityManager = entityManager;
        this.repository=repository;
    }


    @Override
    @Transactional
    public List<City> getAll() {
       Session session= entityManager.unwrap(Session.class);
       List<City> cities=session.createQuery("from City", City.class).getResultList();
       return cities;
    }

    @Override
    public void add(City city) {
        repository.save(city);
    }

    @Override
    public void update(City city) {
        repository.save(city);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public City getByID(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public City updateCityNameById(int id,String name) {
        City c= repository.findById(id).orElse(null);
        if(c!=null){
            c.setName(name);
            repository.save(c);
        }

        return c;
    }
}
