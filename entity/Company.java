/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.entity;


import com.mycompany.prolab_2.Trip;
import com.mycompany.prolab_2.interfaces.IProfitable;
import com.mycompany.prolab_2.repository.ReservationRepository;
import com.mycompany.prolab_2.vehicles.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oztur
 */
public class Company extends User implements IProfitable{ 
    
    private List<Vehicle> vehicles;
    private List<Trip> trips;
    private int yolcuUct;
    private int yakitMal;
   
    
    public Company(){
      
    }
    
     public Company(String kullaniciAdi,String sifre){
         setKullaniciAdi(kullaniciAdi);
         setSifre(sifre);
       
    }
    
  

    public void setVehicles( List<Vehicle> vhcList){
        this.vehicles=vhcList;
    }
    
    public List<Vehicle> getVehicles(){
        if(this.vehicles==null ) {
            this.vehicles = new ArrayList<>();
        }
        
        return this.vehicles;
    }
    
    
  
    /**
     * @return the trips
     */
    public List<Trip> getTrips() {
        if(this.trips==null ) {
            this.trips=  new ArrayList<Trip>();
        }
        
        return trips;
    }

    /**
     * @param trips the trips to set
     */
    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    /**
     * @return the yolcuUct
     */
    public int getYolcuUct() {
        return yolcuUct;
    }

    /**
     * @param yolcuUct the yolcuUct to set
     */
    public void setYolcuUct(int yolcuUct) {
        this.yolcuUct = yolcuUct;
    }

    /**
     * @return the yakitMal
     */
    public int getYakitMal() {
        return yakitMal;
    }

    /**
     * @param yakitMal the yakitMal to set
     */
    public void setYakitMal(int yakitMal) {
        this.yakitMal = yakitMal;
    }

    
    
    
    @Override
    public int karHesapla() {
       int kar;
        
       kar=topBiletHesapla()-(Admin.bedel+yakitMaliyetHEsapla()+topPersonelUct());

        return kar;
    }

    @Override
    public int topPersonelUct() {
       int top=0;
        
        for(Vehicle vehicle : this.vehicles){
            switch(vehicle.getType()){
                
                case "otobus":
                    for (int i = 0; i < 4; i++) {
                       if( vehicle.getPersonel().get(i).getGorev().equals("kullanan")){top+=vehicle.getKullananUct();}
                       else if(vehicle.getPersonel().get(i).getGorev().equals("hizmet")){top+=vehicle.getHizmetUct();}
                        
                    }
                    break;
                case "tren":
                     for (int i = 0; i < 4; i++) {
                       if( vehicle.getPersonel().get(i).getGorev().equals("kullanan")){top+=vehicle.getKullananUct();}
                       else if(vehicle.getPersonel().get(i).getGorev().equals("hizmet")){top+=vehicle.getHizmetUct();}
                        
                    }
                    break;
                case "ucak":
                    for (int i = 0; i < 4; i++) {
                       if( vehicle.getPersonel().get(i).getGorev().equals("kullanan")){top+=vehicle.getKullananUct();}
                       else if(vehicle.getPersonel().get(i).getGorev().equals("hizmet")){top+=vehicle.getHizmetUct();}
                        
                    }
                    break;

            }
           
        }
        return top;
    }


    
    
    @Override
    public int yakitMaliyetHEsapla() {
        
        int maliyet=0;
        
        for(Vehicle vehicle : this.vehicles){
            switch(vehicle.getTrip().getSeferNo()){
                
                case 1:
                    maliyet = vehicle.getYakitFiyat()*750;  
                    break;
                case 2:
                    maliyet= vehicle.getYakitFiyat()*900;
                    break;
                case 3:
                    maliyet= vehicle.getYakitFiyat()*1000;
                    break;
                case 4:
                    maliyet= vehicle.getYakitFiyat()*1200;
                    break;  
                case 5:
                    maliyet= vehicle.getYakitFiyat()*600;
                    break;   
                case 6:
                    maliyet= vehicle.getYakitFiyat()*500;
                    break;     

            }
           
        }
        return maliyet;
    }

    @Override
    public int topBiletHesapla() {
        
        int top=0;
       
            
            
      
       for(int j=0;j<ReservationRepository.listele().size();j++){
         for (Vehicle vehicle : this.vehicles) {
            for (int i = 0; i < ReservationRepository.listele().get(j).getArac().getKoltuk().size(); i++) {
                
               if(ReservationRepository.listele().get(j).getArac().equals(vehicle) &&ReservationRepository.listele().get(j).getArac().getKoltuk().get(i).isDoluluk()){
                    top+=ReservationRepository.listele().get(j).fiyatBUl();
               }
                
            }
          }  
        }
         
        return top;
    }


}
