package com.mp.dsjr2022.dao;

import com.mp.dsjr2022.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.List;

public interface CityDao extends JpaRepository<City, Long> {
    List<City> findAll();
    City findById(Id id);
    City save(City city);
}
