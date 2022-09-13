package com.mp.dsjr2022.service;

import com.mp.dsjr2022.domain.Office;

import java.util.List;

public interface OfficeService {
    List<Office> findAllOffices();

    Office findOfficeById(Long id);

    Office saveOffice(Office office);

    Office updateOffice(Office office);

    Long deleteOffice(Long id);
}
