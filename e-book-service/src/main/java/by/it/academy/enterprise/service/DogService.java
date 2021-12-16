package by.it.academy.enterprise.service;

import by.it.academy.enterprise.dao.impl.DogsDAOImpl;
import by.it.academy.enterprise.entity.Dogs;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DogService {
    @Autowired
    private DogsDAOImpl dogsDAO;
    @Value("${application.name}")
    private String applicationName;

    public String getDogNameByID(Long id) {
        Dogs dogs = dogsDAO.get(id);
        return dogs.getName();
    }

    public int addDog(String name, Short age, String breed) {
        Dogs dogs = new Dogs();
        dogs.setName(name);
        if(age != null) {
            dogs.setAge(age);
        }
        if(breed != null) {
            dogs.setBreed(breed);
        }
        try {
            dogsDAO.add(dogs);
            return 1;
        } catch (HibernateException ignore) {
            return 0;
        }
    }

    public int deleteDog(Long id) {
        try {
            dogsDAO.delete(id);
            return 1;
        } catch (HibernateException ignore) {
            return 0;
        }
    }

    public int updateDog(Long id, String name, Short age, String breed) {
        Dogs dogs = new Dogs();
        dogs.setId(id);
        if (name != null) {
            dogs.setName(name);
        }
        if(age != null) {
            dogs.setAge(age);
        }
        if(breed != null) {
            dogs.setBreed(breed);
        }
        try {
            dogsDAO.update(dogs);
            return 1;
        } catch (HibernateException ignore) {
            return 0;
        }
    }
}
