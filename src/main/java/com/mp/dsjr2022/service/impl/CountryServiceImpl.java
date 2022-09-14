package com.mp.dsjr2022.service.impl;

import com.mp.dsjr2022.dao.CountryDao;
import com.mp.dsjr2022.dao.OfficeDao;
import com.mp.dsjr2022.domain.Country;
import com.mp.dsjr2022.domain.Office;
import com.mp.dsjr2022.service.CountryService;
import com.mp.dsjr2022.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDao countryDao;

    @Override
    public List<Country> findAllCountries() {
        return countryDao.findAll();
    }

    @Override
    public Country findCountryById(Long id) {
        return countryDao.findById(id).get();
    }

    @Override
    public Country saveCountry(Country country) {
        country.setStatus(true);
        //TODO: must be a value from Authorization or Session
        country.setCreatedBy("randi@t.com");
        return countryDao.save(country);
    }

    @Override
    public Country updateCountry(Country country) {
        Country localCountry = this.findCountryById(country.getId());
        localCountry.setName(country.getName());

        return countryDao.save(localCountry);
    }

    @Override
    public Long deleteCountry(Long id) {
        Country localCountry  = this.findCountryById(id);
        localCountry.setStatus(false);

        return countryDao.save(localCountry).getId();
    }
}
