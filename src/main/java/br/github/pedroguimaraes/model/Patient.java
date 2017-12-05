package br.github.pedroguimaraes.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patient implements Serializable{
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPatient; 
    
    @Column
    private String susCard; 
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idPerson", nullable = false)
    private Person person;

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getSusCard() {
        return susCard;
    }

    public void setSusCard(String susCard) {
        this.susCard = susCard;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
