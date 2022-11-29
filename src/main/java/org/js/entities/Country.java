package org.js.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
public class Country {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String code;
    private String name;
    private String continent;
    private int population;
    private Double surfaceArea;

    @Override
    public String toString() {
        return "Country{" +
                "code=" + code +
                ",name='"+name+'\''+
                ", continent='" + continent + '\'' +
                ", population=" + population +
                ", area=" + surfaceArea +
                '}';
    }

    public String getId() {
        return code;
    }

    public void setId(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
}
