package br.github.pedroguimaraes.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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

    
    @ManyToMany
    @JoinTable(
            name = "SchedulingPatient", 
            joinColumns = {@JoinColumn(name = "idPatient")},
            inverseJoinColumns = {@JoinColumn(name="idScheduling")})
    private final List<Scheduling> scheduling = new ArrayList<Scheduling>(); 
    
    
    public void setScheduling(Scheduling scheduling) {
        this.scheduling.add(scheduling);
    }
    
    public List<Scheduling> getSchedulings() {
        return this.scheduling;
    }
    

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }
    
    public int getIdPatient() {
        return this.idPatient;
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
