package br.github.pedroguimaraes.controller;

import br.github.pedroguimaraes.dao.Driverdao;
import br.github.pedroguimaraes.dao.Examdao;
import br.github.pedroguimaraes.dao.Patientdao;
import br.github.pedroguimaraes.dao.Schedulingdao;
import br.github.pedroguimaraes.dao.Vehicledao;
import br.github.pedroguimaraes.model.Driver;
import br.github.pedroguimaraes.model.Exam;
import br.github.pedroguimaraes.model.Patient;
import br.github.pedroguimaraes.model.Vehicle;
import br.github.pedroguimaraes.model.Scheduling;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SchedulingController {

    private Patientdao patient = new Patientdao();
    private Driverdao driver = new Driverdao();
    private Vehicledao vehicle = new Vehicledao();
    private Examdao exam = new Examdao();
    private Scheduling scheduling = new Scheduling();
    private Schedulingdao schedulingdao = new Schedulingdao();

    public List<Patient> getPatients() {
        return patient.findAll();
    }

    public List<Driver> getDrivers() {
        return driver.findAll();
    }

    public List<Vehicle> getVehicles() {
        return vehicle.findAll();
    }

    public List<Exam> getExams() {
        return exam.findAll();
    }

    public boolean addSchedule(List<Patient> patients, Exam exam, Driver driver, Vehicle vehicle, String scheduleTime, String arrivalTime, String cep, String address, String number, String neigh, String city, String state, String country) throws ParseException {
        
        if(patients.size() > 0) {
            for(Patient patient : patients)
                this.scheduling.setPatient(patient);

            this.scheduling.setAddress(address);
            this.scheduling.setNumber(number);
            this.scheduling.setNeighborhood(neigh);
            this.scheduling.setCity(city);
            this.scheduling.setState(state);
            this.scheduling.setCountry(country);
            this.scheduling.setScheduleTime(new SimpleDateFormat("dd/MM/yyyy").parse(scheduleTime));
            this.scheduling.setArrivalTime(new SimpleDateFormat("dd/MM/yyyy").parse(arrivalTime));
            this.scheduling.setExam(exam);
            exam.setScheduling(scheduling);
            this.scheduling.setDriver(driver);
            driver.setScheduling(scheduling);
            this.scheduling.setVehicle(vehicle);
            vehicle.setScheduling(scheduling);

            if(schedulingdao.persist(scheduling))
                return true;
            return false;
        }
        return false;
    }

}
