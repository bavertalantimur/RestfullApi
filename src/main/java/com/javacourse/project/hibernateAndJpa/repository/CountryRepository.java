package com.javacourse.project.hibernateAndJpa.repository;

import com.javacourse.project.hibernateAndJpa.Entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
