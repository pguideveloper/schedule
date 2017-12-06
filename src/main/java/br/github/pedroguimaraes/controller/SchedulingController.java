package br.github.pedroguimaraes.controller;

import br.github.pedroguimaraes.dao.Driverdao;
import br.github.pedroguimaraes.dao.Patientdao;
import br.github.pedroguimaraes.dao.Vehicledao;
import br.github.pedroguimaraes.model.Driver;
import br.github.pedroguimaraes.model.Patient;
import br.github.pedroguimaraes.model.Vehicle;
import java.util.List;



public class SchedulingController {
    private Patientdao patient = new Patientdao();
    private Driverdao driver   = new Driverdao();
    private Vehicledao vehicle = new Vehicledao();
   
    
    public List<Patient> getPatients() {
        return patient.findAll();
    }
    
    public List<Driver> getDrivers() {
        return driver.findAll();
    }
    
    public List<Vehicle> getVehicles() {
        return vehicle.findAll();
    }
    
}
