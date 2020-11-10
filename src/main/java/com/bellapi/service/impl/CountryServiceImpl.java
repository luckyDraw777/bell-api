package com.bellapi.service.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.model.Country;
import com.bellapi.model.mapper.MapperFacade;
import com.bellapi.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl extends AbstractService<Country> {
    @Autowired
    public CountryServiceImpl(AbstractDao<Country> abstractDao, MapperFacade mapperFacade) {
        super(abstractDao, mapperFacade);
        clazz = Country.class;
    }
}
