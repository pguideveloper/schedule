package br.github.pedroguimaraes.controller;

import br.github.pedroguimaraes.dao.Patientdao;
import br.github.pedroguimaraes.model.Patient;
import java.util.List;



public class SchedulingController {
    private Patientdao patient = new Patientdao();
   
    
    public List<Patient> getPatients() {
        return patient.findAll();
    }
}
