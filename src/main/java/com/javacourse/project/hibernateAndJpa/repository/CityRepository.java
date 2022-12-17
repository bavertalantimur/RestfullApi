package com.javacourse.project.hibernateAndJpa.repository;

import com.javacourse.project.hibernateAndJpa.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {

}
