package com.bellapi.dao.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.dao.CountryDocumentDao;
import com.bellapi.model.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class DocumentDaoImpl implements CountryDocumentDao<Document> {


    @Override
    public List<Document> getAll() {

        //TODO
        return null;
    }
}
