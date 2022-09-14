package com.mp.dsjr2022.controller;

import com.mp.dsjr2022.domain.Country;
import com.mp.dsjr2022.service.CountryService;
import com.mp.dsjr2022.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Country> getCountries() {
        return countryService.findAllCountries();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Country getCountry(@PathVariable("id") String id){
        return countryService.findCountryById(Long.valueOf(id));
    }

    @RequestMapping(value = "", produces = "application/json", method = RequestMethod.POST)
    public Country postCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    @RequestMapping(value = "", produces = "application/json", method = RequestMethod.PUT)
    public Country putCountry(@RequestBody Country country) {
        return countryService.updateCountry(country);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteCountry(@PathVariable("id") Long id) {
        return countryService.deleteCountry(id);
    }
}
