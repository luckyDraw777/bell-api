package com.bellapi.service;

import com.bellapi.dao.AbstractDao;
import com.bellapi.model.mapper.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

//TODO work with facade

@Service
public class AbstractService<T> implements GenericService<T> {


    private final AbstractDao<T> abstractDao;
    private final MapperFacade mapperFacade;
    protected Class<T> clazz;

    @Autowired
    public AbstractService(AbstractDao<T> abstractDao, MapperFacade mapperFacade) {
        this.abstractDao = abstractDao;
        this.mapperFacade = mapperFacade;
    }

    @Override
    @Transactional
    public T getById(Long id) {
        return abstractDao.getById(id);
    }

    @Override
    @Transactional
    public void create(T t) {
        abstractDao.create(t);
    }

    @Override
    @Transactional
    public void update(T t) {
        abstractDao.update(t);
    }

    @Override
    @Transactional
    public void remove(T t) {
        abstractDao.remove(t);
    }

    @Override
    @Transactional
    public List<T> getAll(Class<T> type) {
        return abstractDao.getAll(type);
    }
}
