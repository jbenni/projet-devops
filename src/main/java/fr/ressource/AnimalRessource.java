package fr.ressource;

import fr.modele.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import fr.service.AnimalService;

import java.util.Optional;

@RestController
public class AnimalRessource {
    @Autowired
    private AnimalService animalService;


    @GetMapping("/animaux")
    public Iterable<Animal> getAll() {
        return animalService.getAll();
    }

    @PostMapping("/animaux")
    public Animal postAnimal(@RequestBody Animal animal) {
        return animalService.createAnimal(animal);
    }

    @GetMapping("animaux/{id}")
    public Optional<Animal> getOne(@PathVariable Long id) {
        return animalService.getOne(id);
    }
}
