package com.mp.dsjr2022.controller;

import com.mp.dsjr2022.domain.City;
import com.mp.dsjr2022.service.CityService;
import com.mp.dsjr2022.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/cities")
public class CityController {
    @Autowired
    private CityService cityService;
    @RequestMapping(method = RequestMethod.GET)
    public List<City> getCities() {
        return cityService.findAllCities();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public City getCity(@PathVariable("id") String id){
        return cityService.findCityById(Long.valueOf(id));
    }

    @RequestMapping(value = "", produces = "application/json", method = RequestMethod.POST)
    public City postCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @RequestMapping(value = "", produces = "application/json", method = RequestMethod.PUT)
    public City putCity(@RequestBody City city) {
        return cityService.updateCity(city);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteCity(@PathVariable("id") Long id) {
        return cityService.deleteCity(id);
    }
}
