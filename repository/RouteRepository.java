/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.repository;

import com.mycompany.prolab_2.Route;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oztur
 */
public class RouteRepository {
    
    private static List<Route> repo = null;
    private static long sequence ;

    public static synchronized List<Route> initRepo() {
        if (repo == null){
            repo = new ArrayList<>();
            sequence = 1;
           
           
        }
        return repo;
    }
     public static List<Route> listele(){
         initRepo();
        return repo;
    }
    public static Route ekle(String kalkis,String varis,int mesafe){
       initRepo();
        Route rota=new Route(kalkis,varis,mesafe);
        rota.setId(sequence++);
        repo.add(rota);
        return rota;
    }
    public static void sil( Long id){
       initRepo();
        repo = repo.stream().filter(station -> station.getId().equals(id)==false).toList();
    }
    
}
