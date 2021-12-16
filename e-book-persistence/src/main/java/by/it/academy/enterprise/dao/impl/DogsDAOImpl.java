package by.it.academy.enterprise.dao.impl;

import by.it.academy.enterprise.dao.BaseDao;
import by.it.academy.enterprise.entity.Dogs;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.io.Serializable;

@Repository
public class DogsDAOImpl extends BaseDao<Dogs> {
    @Override
    public Dogs add(Dogs dogs) {
        return super.add(dogs);
    }

    @Override
    public Dogs get(Serializable id) {
        return super.get(id);
    }

    @Override
    public Dogs update(Dogs dogs) {
        return super.update(dogs);
    }

    @Override
    public void delete(Serializable id) {
        super.delete(id);
    }

    @Override
    public EntityManager getEm() {
        return super.getEm();
    }

    @Override
    public void setEm(EntityManager em) {
        super.setEm(em);
    }
}
