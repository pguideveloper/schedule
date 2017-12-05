/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.github.pedroguimaraes.controller;

import br.github.pedroguimaraes.dao.Vehicledao;
import br.github.pedroguimaraes.model.Vehicle;

public class VehicleController {
    private final Vehicle vehicle = new Vehicle();
    private final Vehicledao vehicledao = new Vehicledao();
    
    public boolean addVehicle(String type, int seatsNum, String licensePlate, String brand, String year) {
        
        this.vehicle.setType(type);
        this.vehicle.setSeatsNum(seatsNum);
        this.vehicle.setLicensePlate(licensePlate);
        this.vehicle.setBrand(brand);
        this.vehicle.setYear(year);
        
        if(this.vehicledao.persist(vehicle))
            return true;
        return false;
    }
    
}
