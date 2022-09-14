package com.mp.dsjr2022.service.impl;

import com.mp.dsjr2022.domain.State;
import com.mp.dsjr2022.service.OfficeService;
import com.mp.dsjr2022.domain.Office;
import com.mp.dsjr2022.dao.OfficeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeServiceImpl implements OfficeService {
    @Autowired
    private OfficeDao officeDao;

    @Override
    public List<Office> findAllOffices() {
        return officeDao.findAll();
    }

    @Override
    public Office findOfficeById(Long id) {
        return officeDao.findById(id).get();
    }

    @Override
    public Office saveOffice(Office office) {
        office.setStatus(true);
        //TODO: must be a value from Authorization or Session too
        office.setCreatedBy("randi@t.com");
        return officeDao.save(office);
    }

    @Override
    public Office updateOffice(Office office) {
        Office localOffice = this.findOfficeById(office.getId());
        localOffice.setAddress(office.getAddress());
        localOffice.setExtraAddress(office.getExtraAddress());
        localOffice.setPhone(office.getPhone());
        localOffice.setExtraPhone(office.getExtraPhone());
        localOffice.setCityId(office.getCityId());

        return officeDao.save(localOffice);
    }

    @Override
    public Long deleteOffice(Long id) {
        Office localOffice  = this.findOfficeById(id);
        localOffice.setStatus(false);

        return officeDao.save(localOffice).getId();
    }
}
