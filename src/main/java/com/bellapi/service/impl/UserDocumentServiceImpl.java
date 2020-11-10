package com.bellapi.service.impl;

import com.bellapi.dao.AbstractDao;
import com.bellapi.model.UserDocument;
import com.bellapi.model.mapper.MapperFacade;
import com.bellapi.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDocumentServiceImpl extends AbstractService<UserDocument> {
    @Autowired
    public UserDocumentServiceImpl(AbstractDao<UserDocument> abstractDao, MapperFacade mapperFacade) {
        super(abstractDao, mapperFacade);
        clazz = UserDocument.class;
    }
}
