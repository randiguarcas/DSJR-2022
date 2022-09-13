package com.mp.dsjr2022.service.impl;

import com.mp.dsjr2022.service.OfficeService;
import com.mp.dsjr2022.domain.Office;
import com.mp.dsjr2022.dao.OfficeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
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
        return null;
    }

    @Override
    public Office saveOffice(Office office) {
        return null;
    }

    @Override
    public Office updateOffice(Office office) {
        return null;
    }

    @Override
    public Long deleteOffice(Long id) {
        return null;
    }
}
