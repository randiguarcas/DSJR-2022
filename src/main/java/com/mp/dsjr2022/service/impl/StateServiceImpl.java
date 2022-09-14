package com.mp.dsjr2022.service.impl;

import com.mp.dsjr2022.dao.CountryDao;
import com.mp.dsjr2022.dao.StateDao;
import com.mp.dsjr2022.domain.Country;
import com.mp.dsjr2022.domain.State;
import com.mp.dsjr2022.service.CountryService;
import com.mp.dsjr2022.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {
    @Autowired
    private StateDao stateDao;

    @Override
    public List<State> findAllStates() {
        return stateDao.findAll();
    }

    @Override
    public State findStateById(Long id) {
        return stateDao.findById(id).get();
    }

    @Override
    public State saveState(State state) {
        state.setStatus(true);
        //TODO: must be a value from Authorization or Session
        state.setCreatedBy("randi@t.com");
        return stateDao.save(state);
    }

    @Override
    public State updateState(State state) {
        State localState = this.findStateById(state.getId());
        localState.setName(state.getName());

        return stateDao.save(localState);
    }

    @Override
    public Long deleteState(Long id) {
        State localState  = this.findStateById(id);
        localState.setStatus(false);

        return stateDao.save(localState).getId();
    }
}
