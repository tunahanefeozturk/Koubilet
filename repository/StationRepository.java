/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.repository;

import com.mycompany.prolab_2.Station;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oztur
 */
public class StationRepository {
    
     private static List<Station> repo = null;
    private static long sequence ;
      // Static method
    // Static method to create instance of Singleton class
    public static synchronized List<Station> initRepo() {
        if (repo == null){
            repo = new ArrayList<>();
            sequence = 1;
           
           
        }
        return repo;
    }
     public static List<Station> listele(){
         initRepo();
        return repo;
    }
    public static Station ekle(String ad){
       initRepo();
        Station station=new Station(ad);
        station.setId(sequence++);
        repo.add(station);
        return station;
    }
    public static void sil( Long id){
       initRepo();
        repo = repo.stream().filter(station -> station.getId().equals(id)==false).toList();
    }
     public static Station guncelle(Long id,String ad){
        initRepo();
        Station station= repo.stream().filter(tmpStation-> tmpStation.getId().equals(id)).findFirst().orElse(null);
        station.setAd(ad==null || ad.trim().length()==0 ? station.getAd(): ad );
        
        return station;
    }
      
}
