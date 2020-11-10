package com.bellapi.dao.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.model.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class DocumentDaoImpl extends AbstractDao<Document> {

    @Autowired
    public DocumentDaoImpl(EntityManager em) {
        super(em);
        clazz = Document.class;
    }
}
