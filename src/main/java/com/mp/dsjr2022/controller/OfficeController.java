package com.mp.dsjr2022.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mp.dsjr2022.domain.Office;
import com.mp.dsjr2022.service.OfficeService;

import javax.persistence.Id;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/offices")
public class OfficeController {
    @Autowired
    private OfficeService officeService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Office> getOffices() {
        return officeService.findAllOffices();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Office getOffice(@PathVariable("id") String id){
        return officeService.findOfficeById(Long.valueOf(id));
    }

    @RequestMapping(value = "", produces = "application/json", method = RequestMethod.POST)
    public Office postOffice(@RequestBody Office office) {
        return officeService.saveOffice(office);
    }

    @RequestMapping(value = "", produces = "application/json", method = RequestMethod.PUT)
    public Office putOffice(@RequestBody Office office) {
        return officeService.updateOffice(office);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteOffice(@PathVariable("id") Long id) {
        return officeService.deleteOffice(id);
    }
}
