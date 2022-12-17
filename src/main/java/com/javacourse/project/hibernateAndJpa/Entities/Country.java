package com.javacourse.project.hibernateAndJpa.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="country")
@Getter
@Setter
public class Country {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "country",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<City> cities;
}
