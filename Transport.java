/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2;

import com.mycompany.prolab_2.entity.Company;
import com.mycompany.prolab_2.interfaces.IReservable;
import com.mycompany.prolab_2.vehicles.Vehicle;

/**
 *
 * @author oztur
 */
public class Transport implements IReservable{
    private Company foundCompany;
    private Vehicle foundVehicle;
    
    
    public Transport(){}
    
    public Transport (Company company,Vehicle vehicle){
        this.foundCompany=company;
        this.foundVehicle=vehicle;
    }
    
    @Override
    public String toString() {
        return this.foundCompany.getKullaniciAdi()+" - "+this.foundVehicle.getAracAdi()+" - "+this.foundVehicle.getTrip().toString(); 
    }

    /**
     * @return the foundCompany
     */
    public Company getFoundCompany() {
        return foundCompany;
    }

    /**
     * @param foundCompany the foundCompany to set
     */
    public void setFoundCompany(Company foundCompany) {
        this.foundCompany = foundCompany;
    }

    /**
     * @return the foundVehicle
     */
    public Vehicle getFoundVehicle() {
        return foundVehicle;
    }

    /**
     * @param foundVehicle the foundVehicle to set
     */
    public void setFoundVehicle(Vehicle foundVehicle) {
        this.foundVehicle = foundVehicle;
    }

   

    
    
}
