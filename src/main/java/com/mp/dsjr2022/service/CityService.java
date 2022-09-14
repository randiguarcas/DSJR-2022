package com.mp.dsjr2022.service;

import com.mp.dsjr2022.domain.City;

import java.util.List;

public interface CityService {
    List<City> findAllCities();

    City findCityById(Long id);

    City saveCity(City city);

    City updateCity(City city);

    Long deleteCity(Long id);
}
