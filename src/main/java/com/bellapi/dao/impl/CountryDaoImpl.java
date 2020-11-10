package com.bellapi.dao.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CountryDaoImpl extends AbstractDao<Country> {
    @Autowired
    public CountryDaoImpl(EntityManager em) {
        super(em);
        clazz = Country.class;
    }
}
