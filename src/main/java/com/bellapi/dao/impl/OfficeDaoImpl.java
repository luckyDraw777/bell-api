package com.bellapi.dao.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.model.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class OfficeDaoImpl extends AbstractDao<Office> {

    @Autowired
    public OfficeDaoImpl(EntityManager em) {
        super(em);
        clazz = Office.class;
    }
}
