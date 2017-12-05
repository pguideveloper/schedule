/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.github.pedroguimaraes.model;

import br.github.pedroguimaraes.dao.Persondao;
import java.util.Date;

public class teste {
   
    public static void main(String ... args ) {
   
        Person person = new Person();
        User user = new User();
        Persondao persondao = new Persondao();
        
        person.setName("Pedro Henrique");
        person.setBornDate(new Date());
        person.setRG("54.766.981-1");
        person.setCPF("454.367.328-01");
        person.setTelephone("(12) 3887 - 9713");
        person.setCelphone("(12) 9 8226 - 6244");
        person.setCep("11665-320");
        person.setStreet("Rua Saturnino Mariano Nepomuceno");
        person.setNumber("652");
        person.setNeighborhood("Indaiá");
        person.setCity("Caraguatatuba");
        person.setState("SP");
        person.setCountry("Brasil");
        user.setUserName("pguo96");
        user.setUserPass("123456");
        person.setUser(user);
        user.setPerson(person);
        persondao.persist(person);
        
        
        
    }
}
