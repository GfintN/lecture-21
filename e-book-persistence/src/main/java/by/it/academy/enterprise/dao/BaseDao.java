package by.it.academy.enterprise.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

public class BaseDao<T> implements DAO<T> {
    private Class<T> clazz;
    @PersistenceContext
    private static EntityManager em;

    @Transactional
    @Override
    public T add(T t) {
        getEm().persist(t);
        return t;
    }
    
    @Override
    public T get(Serializable id) {
        return getEm().find(clazz, id);
    }

    @Transactional
    @Override
    public T update(T t) {
        getEm().merge(t);
        return t;
    }

    @Transactional
    @Override
    public void delete(Serializable id) {
        T t = getEm().find(clazz, id);
        getEm().remove(t);
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    public EntityManager getEm() {
        return em;
    }
}