package com.mp.dsjr2022.dao;

import com.mp.dsjr2022.domain.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.Id;
import java.util.List;

public interface OfficeDao extends JpaRepository<Office, Long>{
    List<Office> findAll();
    Office findById(Id id);
    Office save(Office office);
}
