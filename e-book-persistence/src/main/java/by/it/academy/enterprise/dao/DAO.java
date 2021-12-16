package by.it.academy.enterprise.dao;

import java.io.Serializable;

public interface DAO<T> {
    public T add(T t);
    public T get(Serializable id);
    public void delete(Serializable id);
    public T update(T t);
}
