package repository;

import modele.Animal;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AnimalRepository {
    private Map<Long, Animal> animaux = new HashMap<>();
    private Long ids = 0L;

    public Iterable<Animal> findAll() {
        return new ArrayList<>(animaux.values());
    }

    public Animal save(Animal animal) {
        animal.setId(ids++);
        animaux.put(animal.getId(), animal);
        return animal;
    }

    public Animal getOne(Long id) {
        return animaux.get(id);
    }
}
