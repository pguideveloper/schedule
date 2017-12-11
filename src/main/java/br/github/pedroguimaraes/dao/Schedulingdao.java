package br.github.pedroguimaraes.dao;

import br.github.pedroguimaraes.model.Scheduling;
import java.util.List;

public class Schedulingdao extends DAO<Scheduling>{

    @Override
    public List<Scheduling> findAll() {
        return this.entityManager.createQuery("FROM Scheduling").getResultList();
    }

    @Override
    public Scheduling getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
}
