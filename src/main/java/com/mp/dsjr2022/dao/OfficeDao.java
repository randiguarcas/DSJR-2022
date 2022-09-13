package com.mp.dsjr2022.dao;

import com.mp.dsjr2022.domain.Office;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

public interface OfficeDao extends JpaRepository<Office, Long>{
    List<Office> findAll();
}
