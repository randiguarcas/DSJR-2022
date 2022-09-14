package com.mp.dsjr2022.dao;

import com.mp.dsjr2022.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface CountryDao extends JpaRepository<Country, Long> {
    List<Country> findAll();

    Country findById(Id id);

    Country save(Country country);
}
