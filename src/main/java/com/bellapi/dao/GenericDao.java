package com.bellapi.dao;

import java.util.List;

public interface GenericDao<T> {

    T getById(Long id);
    void create(T t);
    void update(T t);
    void remove(T t);
    List<T> getAll(Class<T> type);

}
