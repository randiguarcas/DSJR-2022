package com.mp.dsjr2022.service;

import com.mp.dsjr2022.domain.State;

import java.util.List;

public interface StateService {
    List<State> findAllStates();

    State findStateById(Long id);

    State saveState(State state);

    State updateState(State state);

    Long deleteState(Long id);
}
