package br.github.pedroguimaraes.dao;

import br.github.pedroguimaraes.model.Vehicle;
import java.util.List;

public class Vehicledao extends DAO<Vehicle>{

    @Override
    @SuppressWarnings("JPQLValidation")
    public List<Vehicle> findAll() {
        return entityManager.createQuery("FROM Vehicle").getResultList();
    }

    @Override
    public Vehicle getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
