package br.github.pedroguimaraes.controller;

import br.github.pedroguimaraes.dao.Driverdao;
import br.github.pedroguimaraes.model.Driver;
import java.util.List;


public class DriverController {
    Driverdao driverdao = new Driverdao();
    
    public List<Driver> getDrivers(){
        return driverdao.findAll();
    }
}
