package com.bellapi.service;

import java.util.Set;

public interface GenericService<T> {

    T getById(Long id);
    void create(T t);
    void update(T t);
    void remove(T t);
    Set<T> getAll(Class<T> type);
}
