package com.javacourse.project.hibernateAndJpa.Entities;
import jakarta.persistence.*;

@Entity
@Table(name="city")
public class City {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "country_code")
    private String country_code;
    @Column(name = "district")
    private String district;
    @Column(name = "name")
    private String name;
    @Column(name="population")
    private int population;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;


    public City(int id, String country_code, String district, String name, int population) {
        this.id = id;
        this.country_code = country_code;
        this.district = district;
        this.name = name;
        this.population = population;
    }

    public City() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
