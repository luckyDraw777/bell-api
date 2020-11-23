package com.bellapi.service;

import java.util.List;

public interface GenericService<T> {

    T getById(Long id);
    void create(T t);
    void update(T t);
    void remove(T t);
    List<T> getAll(Class<T> type);
}
