package br.github.pedroguimaraes.dao;

import java.util.List;

public class Examdao extends DAO{

    @Override
    public List findAll() {
        return entityManager.createQuery("FROM Exam").getResultList();
    }

    @Override
    public Object getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
