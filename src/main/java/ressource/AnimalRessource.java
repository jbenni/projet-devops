package ressource;

import modele.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AnimalService;

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
    public Animal getOne(@PathVariable Long id) {
        return animalService.getAnimal(id);
    }
}
