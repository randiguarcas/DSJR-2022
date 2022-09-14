package com.mp.dsjr2022.controller;

import com.mp.dsjr2022.domain.State;
import com.mp.dsjr2022.service.CountryService;
import com.mp.dsjr2022.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/states")
public class StateController {
    @Autowired
    private StateService stateService;
    @RequestMapping(method = RequestMethod.GET)
    public List<State> getCountries() {
        return stateService.findAllStates();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public State getCountry(@PathVariable("id") String id){
        return stateService.findStateById(Long.valueOf(id));
    }

    @RequestMapping(value = "", produces = "application/json", method = RequestMethod.POST)
    public State postCountry(@RequestBody State state) {
        return stateService.saveState(state);
    }

    @RequestMapping(value = "", produces = "application/json", method = RequestMethod.PUT)
    public State putCountry(@RequestBody State state) {
        return stateService.updateState(state);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteCountry(@PathVariable("id") Long id) {
        return stateService.deleteState(id);
    }
}
