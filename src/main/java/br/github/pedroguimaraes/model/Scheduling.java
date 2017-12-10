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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Scheduling implements Serializable {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idScheduling;

    @Column
    @Temporal(TemporalType.DATE)
    private Date scheduleTime; 
    
    @Column 
    @Temporal(TemporalType.DATE)
    private Date arrivalTime; 
    
    @Column
    private String address; 
    
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idDriver", nullable = false)
    private Driver driver;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idExam", nullable = false)
    private Exam exam;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idVehicle", nullable = false)
    private Vehicle vehicle;
    
   
    @ManyToMany
     @JoinTable(
            name = "SchedulingPatient", 
            joinColumns = {@JoinColumn(name = "idScheduling")},
            inverseJoinColumns = {@JoinColumn(name="idPatient")})
    private List<Patient> patients = new ArrayList<Patient>();
    
    
    public void setPatient(Patient patient) {
        this.patients.add(patient);
    }
    
    public List<Patient> gePatients() {
        return this.patients;
    }
    
    public int getIdScheduling() {
        return idScheduling;
    }

    public void setIdScheduling(int idScheduling) {
        this.idScheduling = idScheduling;
    }

    public Date getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    
    

}
