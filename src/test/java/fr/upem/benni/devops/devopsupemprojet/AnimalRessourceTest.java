package fr.upem.benni.devops.devopsupemprojet;

import fr.modele.Animal;
import fr.modele.Especes;
import fr.repository.AnimalRepository;
import fr.service.AnimalService;
import org.apache.coyote.ajp.AjpNio2Protocol;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AnimalRessourceTest {


    @LocalServerPort
    private int port;


    @MockBean
    private AnimalService animalService;
    @MockBean
    private AnimalRepository animalRepository;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void putAnimal() {
        Animal animal =new Animal(Especes.INSECTE,"name", "sexe", "arrive", "depart");
    }



}
