package com.bellapi.dao.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserDaoImpl extends AbstractDao<User> {
    @Autowired
    public UserDaoImpl(EntityManager em) {
        super(em);
        clazz = User.class;
    }
}
