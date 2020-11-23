package com.bellapi.service.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.dao.impl.CountryDaoImpl;
import com.bellapi.model.Country;
import com.bellapi.model.mapper.MapperFacade;
import com.bellapi.service.AbstractService;
import com.bellapi.service.CountryDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryDocumentService<Country> {

    @Autowired
    private CountryDaoImpl countryDao;

    @Override
    public List getAll() {
        return countryDao.getAll();
    }
}
