package com.bellapi.service.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.model.Organization;
import com.bellapi.model.mapper.MapperFacade;
import com.bellapi.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl extends AbstractService<Organization> {
    @Autowired
    public OrganizationServiceImpl(AbstractDao<Organization> abstractDao, MapperFacade mapperFacade) {
        super(abstractDao, mapperFacade);
        clazz = Organization.class;
    }
}
