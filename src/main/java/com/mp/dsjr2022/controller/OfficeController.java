package com.mp.dsjr2022.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mp.dsjr2022.domain.Office;
import com.mp.dsjr2022.service.OfficeService;

import java.util.List;

@RestController
@RequestMapping("/api/offices")
public class OfficeController {
    @Autowired
    private OfficeService officeService;

    //@Autowired
    /*public OfficeController(OfficeService mainOfficeService) {
        officeService = mainOfficeService;
    }*/

    @RequestMapping(method = RequestMethod.GET)
    public List<Office> getOffices() {
        return officeService.findAllOffices();
    }

    @RequestMapping(value = "/api/offices/{id}", method = RequestMethod.GET)
    public Office getOffice(@PathVariable("id") Long id){
        return officeService.findOfficeById(id);
    }

    @RequestMapping(value = "/api/offices", method = RequestMethod.POST)
    public void postOffice(@RequestBody Office office) {
        officeService.saveOffice(office);
    }

    @RequestMapping(value = "/api/offices", method = RequestMethod.PUT)
    public void putOffice(@RequestBody Office office) {
        officeService.updateOffice(office);
    }

    @RequestMapping(value = "/api/offices/{id}", method = RequestMethod.DELETE)
    public void deleteOffice(@PathVariable("id") Long id) {
        officeService.deleteOffice(id);
    }
}
