package com.bellapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

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
        em.merge(t);
    }

    @Override
    public void remove(T t) {
        em.remove(t);
    }

    @Override
    public List<T> getAll(Class<T> type) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(type);
        Root<T> root = cq.from(type);
        CriteriaQuery<T> all = cq.select(root);

        TypedQuery<T> allQuery = em.createQuery(all);

        return allQuery.getResultList();
    }
}
