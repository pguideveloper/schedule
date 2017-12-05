package br.github.pedroguimaraes.dao;

import br.github.pedroguimaraes.model.Person;
import java.util.List;


public class Persondao extends DAO<Person>{

    @Override
    public List<Person> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean persist(Person object) {
        
        boolean result = true;
    	
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(object);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
        	ex.printStackTrace();
            entityManager.getTransaction().rollback();
            result = false;
        }
        
        return result;
        
    }
    
}
