package com.bellapi.service.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.dao.impl.OfficeDaoImpl;
import com.bellapi.model.Office;
import com.bellapi.model.mapper.MapperFacade;
import com.bellapi.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfficeServiceImpl extends AbstractService<Office> {
    @Autowired
    public OfficeServiceImpl(OfficeDaoImpl abstractDao, MapperFacade mapperFacade) {
        super(abstractDao, mapperFacade);
        clazz = Office.class;
    }
}
