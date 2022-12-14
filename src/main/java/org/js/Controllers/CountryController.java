package org.js.Controllers;


import org.js.entities.Country;
import org.js.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {


    @Autowired
    CountryRepository repo;
    @RequestMapping("/")
    @ResponseBody
    public String mainPage() {
        return "Hello Spring Boot from mainPage() method!";
    }

    @RequestMapping("/lista/{continent}")
    @ResponseBody
    public String countryList(@PathVariable String continent){
        StringBuilder odp = new StringBuilder();
        for(Country i : repo.findCountryByContinent(continent)){
            odp.append(i).append("<br>");
        }
        return odp.toString();

    }

    @RequestMapping("/kraje/ludnosc/{populationMin}/{populationMax}")
    @ResponseBody
    public String population(@PathVariable String populationMin, @PathVariable String populationMax){
        StringBuilder odp = new StringBuilder();

        int min = Integer.parseInt(populationMin);
        int max = Integer.parseInt(populationMax);

        for(Country i: repo.findByPopulationBetween(min,max)){
            odp.append(i).append("<br>");
        }
        return odp.toString();
    }

    @RequestMapping("/kraje/area/{continent}/{areaMin}/{areaMax}")
    @ResponseBody
    public String area(@PathVariable String continent, @PathVariable String areaMin, @PathVariable String areaMax){
        StringBuilder odp = new StringBuilder();

        Double min = Double.parseDouble(areaMin);
        Double max = Double.parseDouble(areaMax);

        for (Country i : repo.findByContinentAndSurfaceAreaBetween(continent,min,max)){
            odp.append(i).append("<br>");
        }
        return odp.toString();
    }


}
