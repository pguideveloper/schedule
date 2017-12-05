package br.github.pedroguimaraes.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Person implements Serializable {
    
  
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPerson;
    
    @Column
    private String name; 
    
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date bornDate; 
    
    @Column
    private String RG; 
    
    @Column 
    private String CPF; 
    
    @Column
    private String telephone;
    
    @Column
    private String celphone; 
    
    @Column 
    private String cep; 
    
    @Column 
    private String street;
    
    @Column 
    private String number; 
    
    @Column
    private String neighborhood; 
    
    @Column
    private String city;
    
    @Column 
    private String state; 
    
    @Column 
    private String country;
    
    @OneToMany(
            mappedBy = "person",
            targetEntity = User.class, 
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private final List<User> users = new ArrayList<User>();
    
    @OneToMany(
            mappedBy = "person",
            targetEntity = Patient.class, 
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private final List<Patient> patients = new ArrayList<Patient>();
    
    @OneToMany(
            mappedBy = "person",
            targetEntity = Driver.class, 
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private final List<Driver> drivers = new ArrayList<Driver>();

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCelphone() {
        return celphone;
    }

    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
   
    public List<User> getUsers() {
        return this.users;
    }
    
    public void setUser(User user) {
        this.users.add(user);
    }
    
    public List<Patient> getPatient() {
        return this.patients;
    }
    
    public void setPatient(Patient patient) {
        this.patients.add(patient);
    }
    
    public List<Driver> getDriver() {
        return this.drivers;
    }
    
    public void setDriver(Driver driver) {
        this.drivers.add(driver);
    }
    
}
