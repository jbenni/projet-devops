package fr.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;
import static javax.persistence.GenerationType.AUTO;


@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private Especes espece;
    private String name;
    private String sexe;
    private String arrive;
    private String depart;

    public Animal() {

    }

    public Animal(Especes espece, String name, String sexe, String arrive, String depart) {
        this.espece = espece;
        this.name = name;
        this.sexe = sexe;
        this.arrive = arrive;
        this.depart = depart;
    }

    public Long getId() {
        return id;
    }

    public Especes getEspece() {
        return espece;
    }

    public String getName() {
        return name;
    }

    public String  getSexe() {
        return sexe;
    }

    public String  getArrive() {
        return arrive;
    }

    public String getDepart() {
        return depart;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEspece(Especes espece) {
        this.espece = espece;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSexe(String  sexe) {
        this.sexe = sexe;
    }

    public void setArrive(String  arrive) {
        this.arrive = arrive;
    }

    public void setDepart(String  depart) {
        this.depart = depart;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, espece, name, sexe, arrive, depart);
    }
}


