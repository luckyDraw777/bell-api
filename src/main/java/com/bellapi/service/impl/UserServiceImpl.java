package com.bellapi.service.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.dao.impl.UserDaoImpl;
import com.bellapi.model.User;
import com.bellapi.model.mapper.MapperFacade;
import com.bellapi.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractService<User> {
    @Autowired
    public UserServiceImpl(UserDaoImpl abstractDao, MapperFacade mapperFacade) {
        super(abstractDao, mapperFacade);
        clazz = User.class;
    }
}
