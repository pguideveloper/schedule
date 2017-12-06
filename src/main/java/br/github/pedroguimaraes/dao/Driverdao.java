package br.github.pedroguimaraes.dao;

import br.github.pedroguimaraes.model.Driver;
import java.util.List;

public class Driverdao extends DAO<Driver> {

    @Override
    @SuppressWarnings("JPQLValidation")
    public List<Driver> findAll() {
        return entityManager.createQuery("FROM Driver").getResultList();
    }

    @Override
    public Driver getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
