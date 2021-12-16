package by.it.academy.enterprise.dao.impl;

import by.it.academy.enterprise.dao.BaseDao;
import by.it.academy.enterprise.entity.DogsBreeds;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.io.Serializable;

@Repository
public class DogsBreedDAOImpl extends BaseDao<DogsBreeds> {
    @Override
    public DogsBreeds add(DogsBreeds dogsBreeds) {
        return super.add(dogsBreeds);
    }

    @Override
    public DogsBreeds get(Serializable id) {
        return super.get(id);
    }

    @Override
    public DogsBreeds update(DogsBreeds dogsBreeds) {
        return super.update(dogsBreeds);
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
