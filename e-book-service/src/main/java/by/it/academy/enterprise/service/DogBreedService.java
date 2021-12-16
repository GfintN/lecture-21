package by.it.academy.enterprise.service;

import by.it.academy.enterprise.dao.impl.DogsBreedDAOImpl;
import by.it.academy.enterprise.entity.DogsBreeds;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DogBreedService {
    @Autowired
    private DogsBreedDAOImpl dogsBreedDAO;

    @Value("${application.name}")
    private String applicationName;

    public String getDogNameByID(Long id) {
        DogsBreeds dogs = dogsBreedDAO.get(id);
        return dogs.getBreed();
    }

    public int addDog(String breed) {
        DogsBreeds dogs = new DogsBreeds();
        dogs.setBreed(breed);
        try {
            dogsBreedDAO.add(dogs);
            return 1;
        } catch (HibernateException ignore) {
            return 0;
        }
    }

    public int deleteDog(Long id) {
        try {
            dogsBreedDAO.delete(id);
            return 1;
        } catch (HibernateException ignore) {
            return 0;
        }
    }

    public int updateDog(Long id, String breed) {
        DogsBreeds dogs = new DogsBreeds();
        dogs.setBreed(breed);
        dogs.setId(id);
        try {
            dogsBreedDAO.update(dogs);
            return 1;
        } catch (HibernateException ignore) {
            return 0;
        }
    }
}
