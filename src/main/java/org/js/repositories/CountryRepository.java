package org.js.repositories;


import org.js.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {

    List<Country> findAll();
    List<Country> findCountryByContinent(String continent);
    List<Country> findByPopulationBetween(Integer minPopulation, Integer maxPopulation);
    List<Country> findBySurfaceAreaBetween(Double minArea, Double maxArea);

}
