package com.bellapi.dao.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class OrganizationDaoImpl extends AbstractDao<Organization> {

    @Autowired
    public OrganizationDaoImpl(EntityManager em) {
        super(em);
        clazz = Organization.class;
    }
}
