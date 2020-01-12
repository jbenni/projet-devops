package service;

import modele.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AnimalRepository;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public Iterable<Animal> getAll() {
        return animalRepository.findAll();
    }

    public Animal createAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public Animal getAnimal(Long id) {
        return animalRepository.getOne(id);
    }
}
