/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2;

import com.mycompany.prolab_2.person.Passenger;
import com.mycompany.prolab_2.vehicles.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author oztur
 */
public class Reservation {
    private Long id;
    private static long sequence ;
    private List<Passenger> yolcu=new ArrayList<>();
    private Vehicle arac = new Vehicle();
    private Route rota;
    private int fiyat;
    
    public Reservation(){}
    
    public Reservation(Vehicle vehicle){
        this.arac=vehicle;
        Random r=new Random();
        int rand=r.nextInt(vehicle.getKapasite()-1)+1;
        
        vehicle.getKoltuk().get(rand).setDoluluk(true);
        
    }
    
     public Reservation(Vehicle vehicle,Route rota){
        Random r=new Random();
        int rand=r.nextInt(vehicle.getKapasite()-1)+1;
        
        vehicle.getKoltuk().get(rand).setDoluluk(true);
       this.arac=vehicle;
       this.rota=rota;
    }
  

    /**
     * @return the arac
     */
    public Vehicle getArac() {
        return arac;
    }

    /**
     * @param arac the arac to set
     */
    public void setArac(Vehicle arac) {
        this.arac = arac;
    }


    
    public  int fiyatBUl(){
       
     if(this.arac.getType().equals("otobus")){
         if(this.rota.getKalkis().equals("istanbul")){
             if(this.rota.getVaris().equals("kocaeli")){this.fiyat=50;}
             else if(this.rota.getVaris().equals("ankara")){this.fiyat=300;}
             else if(this.rota.getVaris().equals("eskişehir")){this.fiyat=150;}
             else if(this.rota.getVaris().equals("konya")){this.fiyat=300;}
         }
         else if(this.rota.getKalkis().equals("kocaeli")){
             if(this.rota.getVaris().equals("istanbul")){this.fiyat=50;}
             else if(this.rota.getVaris().equals("ankara")){this.fiyat=400;}
             else if(this.rota.getVaris().equals("eskişehir")){this.fiyat=100;}
             else if(this.rota.getVaris().equals("konya")){this.fiyat=250;}
         }
         else if(this.rota.getKalkis().equals("ankara")){
             if(this.rota.getVaris().equals("kocaeli")){this.fiyat=400;}
             else if(this.rota.getVaris().equals("istanbul")){this.fiyat=300;}
           
         }
         else if(this.rota.getKalkis().equals("eskişehir")){
             if(this.rota.getVaris().equals("kocaeli")){this.fiyat=100;}
             else if(this.rota.getVaris().equals("istanbul")){this.fiyat=150;}
             else if(this.rota.getVaris().equals("konya")){this.fiyat=150;}
         }
         else if(this.rota.getKalkis().equals("konya")){
             if(this.rota.getVaris().equals("kocaeli")){this.fiyat=250;}
             else if(this.rota.getVaris().equals("eskişehir")){this.fiyat=150;}
             else if(this.rota.getVaris().equals("istanbul")){this.fiyat=300;}
         }
         
         
     }
     else if(this.arac.getType().equals("tren")){
          if(this.rota.getKalkis().equals("istanbul")){
             if(this.rota.getVaris().equals("kocaeli")){this.fiyat=50;}
             else if(this.rota.getVaris().equals("bilecik")){this.fiyat=150;}
             else if(this.rota.getVaris().equals("ankara")){this.fiyat=250;}
             else if(this.rota.getVaris().equals("eskişehir")){this.fiyat=200;}
             else if(this.rota.getVaris().equals("konya")){this.fiyat=300;}
         }
         else if(this.rota.getKalkis().equals("kocaeli")){
             if(this.rota.getVaris().equals("istanbul")){this.fiyat=50;}
             else if(this.rota.getVaris().equals("bilecik")){this.fiyat=50;}
             else if(this.rota.getVaris().equals("ankara")){this.fiyat=200;}
             else if(this.rota.getVaris().equals("eskişehir")){this.fiyat=100;}
             else if(this.rota.getVaris().equals("konya")){this.fiyat=250;}
         }
         else if(this.rota.getKalkis().equals("bilecik")){
             if(this.rota.getVaris().equals("istanbul")){this.fiyat=150;}
             else if(this.rota.getVaris().equals("kocaeli")){this.fiyat=50;}
             else if(this.rota.getVaris().equals("ankara")){this.fiyat=150;}
             else if(this.rota.getVaris().equals("eskişehir")){this.fiyat=500;}
             else if(this.rota.getVaris().equals("konya")){this.fiyat=200;}
         }
         else if(this.rota.getKalkis().equals("ankara")){
             if(this.rota.getVaris().equals("kocaeli")){this.fiyat=200;}
             else if(this.rota.getVaris().equals("istanbul")){this.fiyat=250;}
             else if(this.rota.getVaris().equals("bilecik")){this.fiyat=150;}
             else if(this.rota.getVaris().equals("eskişehir")){this.fiyat=100;}
         }
         else if(this.rota.getKalkis().equals("eskişehir")){
             if(this.rota.getVaris().equals("kocaeli")){this.fiyat=100;}
             else if(this.rota.getVaris().equals("istanbul")){this.fiyat=200;}
             else if(this.rota.getVaris().equals("konya")){this.fiyat=150;}
             else if(this.rota.getVaris().equals("bilecik")){this.fiyat=50;}
             else if(this.rota.getVaris().equals("ankara")){this.fiyat=100;}
         }
         else if(this.rota.getKalkis().equals("konya")){            
             if(this.rota.getVaris().equals("kocaeli")){this.fiyat=250;}
             else if(this.rota.getVaris().equals("istanbul")){this.fiyat=300;}
             else if(this.rota.getVaris().equals("eskişehir")){this.fiyat=150;}
             else if(this.rota.getVaris().equals("bilecik")){this.fiyat=200;}
         }
     }
     else if(this.arac.getType().equals("ucak")){
         if(this.rota.getKalkis().equals("istanbul")){
             if(this.rota.getVaris().equals("ankara")){this.fiyat=1000;}
             else if(this.rota.getVaris().equals("konya")){this.fiyat=1200;}
         }
          else if(this.rota.getKalkis().equals("ankara")){
              this.fiyat=1000;    
         }
          else if(this.rota.getKalkis().equals("konya")){
            this.fiyat=1200;
         }
     }
       return this.fiyat;
    }
    
    public int mesafeHesapla(){
        if(this.arac.getType().equals("otobus")){
         if(this.rota.getKalkis().equals("istanbul")){
             if(this.rota.getVaris().equals("kocaeli")){this.rota.setMesafe(100);}
             else if(this.rota.getVaris().equals("ankara")){this.rota.setMesafe(500);}
             else if(this.rota.getVaris().equals("eskişehir")){this.rota.setMesafe(300);}
             else if(this.rota.getVaris().equals("konya")){this.rota.setMesafe(600);}
         }
         else if(this.rota.getKalkis().equals("kocaeli")){
             if(this.rota.getVaris().equals("istanbul")){this.rota.setMesafe(100);}
             else if(this.rota.getVaris().equals("ankara")){this.rota.setMesafe(400);}
             else if(this.rota.getVaris().equals("eskişehir")){this.rota.setMesafe(200);}
             else if(this.rota.getVaris().equals("konya")){this.rota.setMesafe(500);}
         }
         else if(this.rota.getKalkis().equals("ankara")){
             if(this.rota.getVaris().equals("kocaeli")){this.rota.setMesafe(400);}
             else if(this.rota.getVaris().equals("istanbul")){this.rota.setMesafe(500);}
           
         }
         else if(this.rota.getKalkis().equals("eskişehir")){
             if(this.rota.getVaris().equals("kocaeli")){this.rota.setMesafe(200);}
             else if(this.rota.getVaris().equals("istanbul")){this.rota.setMesafe(300);}
             else if(this.rota.getVaris().equals("konya")){this.rota.setMesafe(300);}
         }
         else if(this.rota.getKalkis().equals("konya")){
             if(this.rota.getVaris().equals("kocaeli")){this.rota.setMesafe(500);}
             else if(this.rota.getVaris().equals("eskişehir")){this.rota.setMesafe(300);}
             else if(this.rota.getVaris().equals("istanbul")){this.rota.setMesafe(600);}
         }
         
         
     }
     else if(this.arac.getType().equals("tren")){
          if(this.rota.getKalkis().equals("istanbul")){
             if(this.rota.getVaris().equals("kocaeli")){ this.rota.setMesafe(75);}
             else if(this.rota.getVaris().equals("bilecik")){ this.rota.setMesafe(225);}
             else if(this.rota.getVaris().equals("ankara")){this.rota.setMesafe(375);}
             else if(this.rota.getVaris().equals("eskişehir")){this.rota.setMesafe(300);}
             else if(this.rota.getVaris().equals("konya")){this.rota.setMesafe(450);}
         }
         else if(this.rota.getKalkis().equals("kocaeli")){
             if(this.rota.getVaris().equals("istanbul")){ this.rota.setMesafe(75);}
             else if(this.rota.getVaris().equals("bilecik")){ this.rota.setMesafe(75);}
             else if(this.rota.getVaris().equals("ankara")){ this.rota.setMesafe(300);}
             else if(this.rota.getVaris().equals("eskişehir")){ this.rota.setMesafe(150);}
             else if(this.rota.getVaris().equals("konya")){ this.rota.setMesafe(350);}
         }
         else if(this.rota.getKalkis().equals("bilecik")){
             if(this.rota.getVaris().equals("istanbul")){ this.rota.setMesafe(225);}
             else if(this.rota.getVaris().equals("kocaeli")){ this.rota.setMesafe(75);}
             else if(this.rota.getVaris().equals("ankara")){ this.rota.setMesafe(225);}
             else if(this.rota.getVaris().equals("eskişehir")){ this.rota.setMesafe(75);}
             else if(this.rota.getVaris().equals("konya")){ this.rota.setMesafe(300);}
         }
         else if(this.rota.getKalkis().equals("ankara")){
             if(this.rota.getVaris().equals("kocaeli")){ this.rota.setMesafe(300);}
             else if(this.rota.getVaris().equals("istanbul")){ this.rota.setMesafe(350);}
             else if(this.rota.getVaris().equals("bilecik")){ this.rota.setMesafe(225);}
             else if(this.rota.getVaris().equals("eskişehir")){ this.rota.setMesafe(150);}
         }
         else if(this.rota.getKalkis().equals("eskişehir")){
             if(this.rota.getVaris().equals("kocaeli")){ this.rota.setMesafe(150);}
             else if(this.rota.getVaris().equals("istanbul")){ this.rota.setMesafe(300);}
             else if(this.rota.getVaris().equals("konya")){ this.rota.setMesafe(225);}
             else if(this.rota.getVaris().equals("bilecik")){ this.rota.setMesafe(75);}
             else if(this.rota.getVaris().equals("ankara")){ this.rota.setMesafe(150);}
         }
         else if(this.rota.getKalkis().equals("konya")){            
             if(this.rota.getVaris().equals("kocaeli")){ this.rota.setMesafe(350);}
             else if(this.rota.getVaris().equals("istanbul")){ this.rota.setMesafe(450);}
             else if(this.rota.getVaris().equals("eskişehir")){ this.rota.setMesafe(225);}
             else if(this.rota.getVaris().equals("bilecik")){ this.rota.setMesafe(300);}
         }
     }
     else if(this.arac.getType().equals("ucak")){
         if(this.rota.getKalkis().equals("istanbul")){
             if(this.rota.getVaris().equals("ankara")){ this.rota.setMesafe(250);}
             else if(this.rota.getVaris().equals("konya")){ this.rota.setMesafe(300);}
         }
          else if(this.rota.getKalkis().equals("ankara")){
             this.rota.setMesafe(250);   
         }
          else if(this.rota.getKalkis().equals("konya")){
            this.rota.setMesafe(300);
         }
     }
       return this.rota.getMesafe();
    }
    
    /**
     * @return the rota
     */
    public Route getRota() {
        return rota;
    }

    /**
     * @param rota the rota to set
     */
    public void setRota(Route rota) {
        this.rota = rota;
    }

    /**
     * @return the fiyat
     */
    public int getFiyat() {
        return fiyat;
    }

    /**
     * @param fiyat the fiyat to set
     */
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    
   
   
    public synchronized List<Passenger> initRepo() {
        if (this.getYolcu() == null){
            this.setYolcu(new ArrayList<>());
            sequence = 1;
           
           
        }
        return this.getYolcu();
    }
     public List<Passenger> listele(){
         initRepo();
        return this.getYolcu();
    }
    public  Passenger ekle(String ad,String soyad,String tc,int yas,Koltuk koltuk){
       initRepo();
        Passenger passenger= new Passenger(ad,soyad,tc,yas,koltuk);
        passenger.setId(sequence++);
        this.getYolcu().add(passenger);
        return passenger;
    }
    public  void sil( Long id){
       initRepo();
       this.setYolcu(this.getYolcu().stream().filter(station -> station.getId().equals(id)==false).toList());
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the yolcu
     */
    public List<Passenger> getYolcu() {
        return yolcu;
    }

    /**
     * @param yolcu the yolcu to set
     */
    public void setYolcu(List<Passenger> yolcu) {
        this.yolcu = yolcu;
    }
    
}
