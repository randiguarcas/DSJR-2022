package com.mp.dsjr2022.service;

import com.mp.dsjr2022.domain.Country;

import java.util.Collection;
import java.util.List;

public interface CountryService {
    List<Country> findAllCountries();

    Country findCountryById(Long id);

    Country saveCountry(Country country);

    Country updateCountry(Country country);

    Long deleteCountry(Long id);
}
