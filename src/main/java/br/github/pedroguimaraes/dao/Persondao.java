package br.github.pedroguimaraes.dao;

import br.github.pedroguimaraes.model.Person;
import br.github.pedroguimaraes.model.User;
import java.util.List;
import javax.persistence.Query;


public class Persondao extends DAO<Person>{

    @Override
    public List<Person> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(int id) {
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
    
    public List<User> login(String login, String pass) {
        try{
            this.entityManager.getTransaction().begin();
            Query result = this.entityManager.createQuery("From User where userName = ?1 and userPass = ?2");
            result.setParameter(1, login);
            result.setParameter(2, pass);
         
            this.entityManager.getTransaction().commit();
            return result.getResultList();
        }catch(Exception ex) {
            ex.printStackTrace();
            this.entityManager.getTransaction().rollback();
            return null;
        }
    }
    
}
