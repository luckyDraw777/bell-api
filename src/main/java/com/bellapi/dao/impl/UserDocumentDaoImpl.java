package com.bellapi.dao.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.model.UserDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserDocumentDaoImpl extends AbstractDao<UserDocument> {
    @Autowired
    public UserDocumentDaoImpl(EntityManager em) {
        super(em);
        clazz = UserDocument.class;
    }
}
