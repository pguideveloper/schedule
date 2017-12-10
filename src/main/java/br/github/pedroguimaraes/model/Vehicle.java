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
import javax.persistence.OneToMany;

@Entity
public class Vehicle implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehicle;

    @Column
    private String type;

    @Column
    private int seatsNum;

    @Column
    private String licensePlate;

    @Column
    private String brand;

    @Column
    private String year;

    @OneToMany(
            mappedBy = "vehicle",
            fetch = FetchType.LAZY,
            targetEntity = Scheduling.class)
    private final List<Scheduling> scheduling = new ArrayList<Scheduling>();

    public List<Scheduling> getScheduling() {
        return scheduling;
    }
    
    public void setScheduling(Scheduling scheduling) {
        this.scheduling.add(scheduling);
    }
    
    public int getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(int idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
