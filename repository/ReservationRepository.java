/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.repository;

import com.mycompany.prolab_2.Reservation;
import com.mycompany.prolab_2.Route;
import com.mycompany.prolab_2.vehicles.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oztur
 */
public class ReservationRepository {
      private static List<Reservation> repo = null;
    private static long sequence ;

    public static synchronized List<Reservation> initRepo() {
        if (repo == null){
            repo = new ArrayList<>();
            sequence = 1;
           
           
        }
        return repo;
    }
     public static List<Reservation> listele(){
         initRepo();
        return repo;
    }
    public static Reservation ekle(Vehicle vehicle,Route rota){
       initRepo();
        Reservation reservation=new Reservation(vehicle,rota);
        reservation.setId(sequence++);
        repo.add(reservation);
        return reservation;
    }
    public static void sil( Long id){
       initRepo();
        repo = repo.stream().filter(reservation -> reservation.getId().equals(id)==false).toList();
    }
    
}
