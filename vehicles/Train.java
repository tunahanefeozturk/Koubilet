/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.vehicles;

import com.mycompany.prolab_2.Trip;

/**
 *
 * @author oztur
 */
public class Train extends Vehicle{
    
    private int koltuk=25;
   
    
    public Train(){}

    public Train(String type,String adi,String yakit,int kapst,Trip trip,int yakitFiyat){
        super.setAracAdi(adi);
        super.setYakit(yakit);
        super.setKapasite(kapst);
        super.setTrip(trip);
        super.setType(type);
        super.setYakitFiyat(yakitFiyat);
    }
     public Train(String adi,String yakit,int kapst,Trip trip){
        super.setAracAdi(adi);
        super.setYakit(yakit);
        super.setKapasite(kapst);
        super.setTrip(trip);
    
    }
 
      @Override
    public String toString() {

        return super.getAracID()+" - "+this.getType()+" - "+super.getAracAdi()+" - "+super.getYakit()+" - "+super.getKapasite()+" - "+super.getTrip().getSeferNo(); 
    }
    
}
