/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.repository;

import com.mycompany.prolab_2.Trip;
import com.mycompany.prolab_2.entity.Company;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.prolab_2.Station;
import com.mycompany.prolab_2.Transport;
import com.mycompany.prolab_2.vehicles.Vehicle;
import java.util.LinkedList;


/**
 *
 * @author oztur
 */
public class TripRepository {
     public static List<Trip> tripList= null;
     public static int seferNoSeq;
     
     public static synchronized List<Trip> initRepo() {
        if (tripList == null){
            tripList = new ArrayList<>();
            seferNoSeq = 1;
        }
        return tripList;
    }
     
     public static List<Trip> listele(){
         initRepo();
        return tripList;
    }
     
     public static Trip ekle(LinkedList<Station> gzr){
       initRepo();
       Trip trip = new Trip(seferNoSeq++, gzr);

       tripList.add(trip);
       return trip;
    } 
     
     public static List<Transport> tripAra(String kalkis,String varis){
         
        List<Trip> foundTrips=new ArrayList<>(); 
         
       
        for (int i = 0; i <  TripRepository.listele().size(); i++) {
            boolean kalkisBulundu=false;
            boolean varisBulundu=false;
            for (int j = 0; j < TripRepository.listele().get(i).getYol().size(); j++) {
                
                if(TripRepository.listele().get(i).getYol().get(j).getAd().equals(kalkis)){
                    kalkisBulundu=true;
                }
                if( kalkisBulundu==true && TripRepository.listele().get(i).getYol().get(j).getAd().equals(varis)){
                    varisBulundu=true;
                    break;
                }
                
                
            }
            if(kalkisBulundu==true && varisBulundu==true){
                foundTrips.add(TripRepository.listele().get(i));
            }    
            
        }
        
        
        List<Transport> foundTransport=new ArrayList<>();
        
        if(foundTrips.isEmpty() == false){
            List<Company> companyList = CompanyRepository.listele();
            for (Company company : companyList) {
                List<Vehicle> vehicleList = company.getVehicles();
                for (Vehicle vehicle : vehicleList) {
                     for (int i = 0; i < foundTrips.size(); i++) {
                        if(vehicle.getTrip().getSeferNo() == foundTrips.get(i).getSeferNo()){
                            foundTransport.add(new Transport(company, vehicle));
                        }
                    }
                }
            }
        }

       return foundTransport;
     }
     
     public static Trip getTripBySeferNo(int seferNo){
         return listele().stream().filter(trip -> trip.getSeferNo() == seferNo).findFirst().orElse(null);
     }
}
