package com.mp.dsjr2022.dao;

import com.mp.dsjr2022.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.List;

public interface StateDao extends JpaRepository<State, Long> {
    List<State> findAll();
    State findById(Id id);
    State save(State state);
}
