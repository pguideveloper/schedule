package br.github.pedroguimaraes.controller;

import br.github.pedroguimaraes.dao.Patientdao;
import br.github.pedroguimaraes.dao.Persondao;
import br.github.pedroguimaraes.model.Driver;
import br.github.pedroguimaraes.model.Patient;
import br.github.pedroguimaraes.model.Person;
import br.github.pedroguimaraes.model.User;
import java.util.Date;
import java.util.List;

public class PersonController {
    private Person person = new Person();
    private Persondao persondao = new Persondao();
    private User user = new User();
    private Driver driver = new Driver();
    private Patient patient = new Patient();
    private Patientdao patientdao = new Patientdao();
    
    
    public boolean addUser(String name, String bornDate, String rg, String cpf, String tel, String cel, String cep, String street, String number, String neighborhood, String city, String state, String country, String user, String pass) {
    
        this.person.setName(name);
        this.person.setBornDate(new Date(bornDate));
        this.person.setRG(rg);
        this.person.setCPF(cpf);
        this.person.setTelephone(tel);
        this.person.setCelphone(cel);
        this.person.setStreet(street);
        this.person.setNumber(number);
        this.person.setNeighborhood(neighborhood);
        this.person.setCity(city);
        this.person.setCountry(country);
        this.user.setUserName(user);
        this.user.setUserPass(pass);
        this.person.setUser(this.user);
        this.user.setPerson(person);
        
        if(this.persondao.persist(person))
            return true;
        return false;
        
    }
    
    public boolean addPatient(String name, String bornDate, String rg, String cpf, String tel, String cel, String cep, String street, String number, String neighborhood, String city, String state, String country, String susCard) {
        this.person.setName(name);
        this.person.setBornDate(new Date(bornDate));
        this.person.setRG(rg);
        this.person.setCPF(cpf);
        this.person.setTelephone(tel);
        this.person.setCelphone(cel);
        this.person.setStreet(street);
        this.person.setNumber(number);
        this.person.setNeighborhood(neighborhood);
        this.person.setCity(city);
        this.person.setCountry(country);
        this.patient.setSusCard(susCard);
        this.person.setPatient(this.patient);
        this.patient.setPerson(person);
        
        if(this.persondao.persist(person))
            return true;
        return false;
    }
    
    public boolean addDriver(String name, String bornDate, String rg, String cpf, String tel, String cel, String cep, String street, String number, String neighborhood, String city, String state, String country, String driverLicense, String expTime) {
        this.person.setName(name);
        this.person.setBornDate(new Date(bornDate));
        this.person.setRG(rg);
        this.person.setCPF(cpf);
        this.person.setTelephone(tel);
        this.person.setCelphone(cel);
        this.person.setStreet(street);
        this.person.setNumber(number);
        this.person.setNeighborhood(neighborhood);
        this.person.setCity(city);
        this.person.setCountry(country);
        this.driver.setDriverLicense(driverLicense);
        this.driver.setExperience(expTime);
        this.person.setDriver(driver);
        this.driver.setPerson(person);
        
        if(this.persondao.persist(person))
            return true;
        return false;
    }
    
    public List<Patient> getPatientByName(String patientName) {
        if(!patientName.isEmpty())
           return this.patientdao.getByName(patientName);
        return null;
    }
}
