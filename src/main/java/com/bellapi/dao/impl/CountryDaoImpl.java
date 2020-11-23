package com.bellapi.dao.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.dao.CountryDocumentDao;
import com.bellapi.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CountryDaoImpl implements CountryDocumentDao<Country> {


    @Override
    public List<Country> getAll() {
        //TODO
        return null;
    }
}
