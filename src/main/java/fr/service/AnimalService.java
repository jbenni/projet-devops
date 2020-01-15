package fr.service;

import fr.modele.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.repository.AnimalRepository;

import java.util.Optional;

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

    public Optional<Animal> getOne(Long id) {

        return animalRepository.findById(id);
    }
}
