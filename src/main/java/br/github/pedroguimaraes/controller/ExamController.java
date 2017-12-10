/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.github.pedroguimaraes.controller;

import br.github.pedroguimaraes.dao.Examdao;
import br.github.pedroguimaraes.model.Exam;

/**
 *
 * @author root
 */
public class ExamController {
  
    Exam exam = new Exam();
    Examdao examdao = new Examdao();
    
    public boolean addExam(String name, String description) {
        this.exam.setName(name);
        this.exam.setDescription(description);
        
        if(this.examdao.persist(this.exam))
            return true; 
        else
            return false; 
    }
}
