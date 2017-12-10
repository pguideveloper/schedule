package br.github.pedroguimaraes.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Driver implements Serializable{

    
   @Id
   @Column
   @GeneratedValue
   private int idDriver; 
   
   @Column
   private String driverLicense;
   
   @Column
   private String experience;
   
   @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn(name = "idPerson", nullable = false)
   private Person person;
   
   @OneToMany(
            mappedBy = "driver",
            fetch = FetchType.LAZY,
            targetEntity = Scheduling.class)
    private final List<Scheduling> scheduling = new ArrayList<Scheduling>();

    public List<Scheduling> getScheduling() {
        return scheduling;
    }
    
    public void setScheduling(Scheduling scheduling) {
        this.scheduling.add(scheduling);
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    } 
    
}
