package modele;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Animal {
    @Id
    private long id;
    private Especes espece;
    private String name;
    private char sexe;
    private Date arrive;
    private Date depart;

    public Animal(long id, Especes espece, String name, char sexe, Date arrive, Date depart) {
        this.id = id;
        this.espece = espece;
        this.name = name;
        this.sexe = sexe;
        this.arrive = arrive;
        this.depart = depart;
    }

    public long getId() {
        return id;
    }

    public Especes getEspece() {
        return espece;
    }

    public String getName() {
        return name;
    }

    public char getSexe() {
        return sexe;
    }

    public Date getArrive() {
        return arrive;
    }

    public Date getDepart() {
        return depart;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEspece(Especes espece) {
        this.espece = espece;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void setArrive(Date arrive) {
        this.arrive = arrive;
    }

    public void setDepart(Date depart) {
        this.depart = depart;
    }
}


