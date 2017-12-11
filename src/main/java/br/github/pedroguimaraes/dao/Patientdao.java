package br.github.pedroguimaraes.dao;

import br.github.pedroguimaraes.model.Patient;
import java.util.List;


public class Patientdao extends DAO<Patient>{

    @Override
    public List<Patient> findAll() {
        return entityManager
                .createQuery("FROM Patient").getResultList();
    }

    @Override
    public Patient getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Patient> getByName(String patientName) {
        return entityManager
                .createQuery("FROM Patient as p WHERE p.person.name LIKE '%" + patientName + "%'").getResultList();
    }    
}
