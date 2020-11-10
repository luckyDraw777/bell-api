package com.bellapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Set;

@Repository
public abstract class AbstractDao<T> implements GenericDao<T>{

    private final EntityManager em;
    protected Class<T> clazz;

    @Autowired
    public AbstractDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public T getById(Long id) {
        return em.find(clazz, id);
    }

    @Override
    public void create(T t) {
        em.persist(t);
    }

    @Override
    public void update(T t) {

    }

    @Override
    public void remove(T t) {
        em.remove(t);
    }

    @Override
    public Set<T> getAll(Class<T> type) {
        return null;
    }
}
