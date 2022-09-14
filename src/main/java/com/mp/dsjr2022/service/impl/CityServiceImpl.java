package com.mp.dsjr2022.service.impl;

import com.mp.dsjr2022.dao.CityDao;
import com.mp.dsjr2022.dao.StateDao;
import com.mp.dsjr2022.domain.City;
import com.mp.dsjr2022.domain.Country;
import com.mp.dsjr2022.service.CityService;
import com.mp.dsjr2022.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> findAllCities() {
        return cityDao.findAll();
    }

    @Override
    public City findCityById(Long id) {
        return cityDao.findById(id).get();
    }

    @Override
    public City saveCity(City city) {
        city.setStatus(true);
        //TODO: must be a value from Authorization or Session
        city.setCreatedBy("randi@t.com");
        return cityDao.save(city);
    }

    @Override
    public City updateCity(City city) {
        City localState = this.findCityById(city.getId());
        localState.setName(city.getName());

        return cityDao.save(localState);
    }

    @Override
    public Long deleteCity(Long id) {
        City localCity  = this.findCityById(id);
        localCity.setStatus(false);

        return cityDao.save(localCity).getId();
    }
}
