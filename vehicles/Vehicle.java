/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.vehicles;

import com.mycompany.prolab_2.Koltuk;
import com.mycompany.prolab_2.Trip;
import com.mycompany.prolab_2.person.Personel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oztur
 */
public class Vehicle{
    private String aracAdi;
    private  Long aracID;
    private String yakit;
    private int kapasite;
    private Trip trip;
    private List<Personel> personel=null;
    private List<Koltuk> koltuk=new ArrayList<>();
    private String type;
    private int yakitFiyat;
     private int kullananUct;
    private int hizmetUct;
    
    
    public Vehicle(){}
    
    
    public Vehicle( String yakit,int kapasite){
        aracID++;
        this.yakit =yakit;
        this.kapasite=kapasite;
     }

     /**
     * @return the aracAdi
     */
    public String getAracAdi() {
        return aracAdi;
    }

    /**
     * @param aracAdi the aracAdi to set
     */
    public void setAracAdi(String aracAdi) {
        this.aracAdi = aracAdi;
    }
    /**
     * @return the aracID
     */
    public Long getAracID() {
        return aracID;
    }
/**
     * @param aracID the aracID to set
     */
    public void setAracID(Long aracID) {
        this.aracID = aracID;
    }

    /**
     * @return the yakit
     */
    public String getYakit() {
        return yakit;
    }

    /**
     * @param yakit the yakit to set
     */
    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    /**
     * @return the kapasite
     */
    public int getKapasite() {
        return kapasite;
    }

    /**
     * @param kapasite the kapasite to set
     */
    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    
   
    /**
     * @return the trip
     */
    public Trip getTrip() {
        return trip;
    }

    /**
     * @param trip the trip to set
     */
    public void setTrip(Trip trip) {
        this.trip = trip;
    }

  @Override
    public String toString() {

        return this.aracID+" - "+this.aracAdi+" - "+this.yakit+" - "+this.kapasite+" - "+this.trip.getSeferNo(); 
    }

    public Vehicle(String aracAdi, Long aracID, String yakit, int kapasite, Trip trip) {
        this.aracAdi = aracAdi;
        this.aracID = aracID;
        this.yakit = yakit;
        this.kapasite = kapasite;
        this.trip = trip;
    }

  
    /**
     * @return the koltuk
     */
    public List<Koltuk> getKoltuk() {
        return koltuk;
    }

    /**
     * @param koltuk the koltuk to set
     */
    public void setKoltuk(List<Koltuk> koltuk) {
        
        this.koltuk = koltuk;
    }

    
     public List<Koltuk> koltukListele(){
         
         for (int i = 1; i <= this.kapasite; i++) {
             Koltuk newKoltuk=new Koltuk();
             newKoltuk.setKoltukNo(i);
             newKoltuk.setDoluluk(false);
             this.koltuk.add(newKoltuk);
             
         }
       return this.koltuk;
     }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the yakitFiyat
     */
    public int getYakitFiyat() {
        return yakitFiyat;
    }

    /**
     * @param yakitFiyat the yakitFiyat to set
     */
    public void setYakitFiyat(int yakitFiyat) {
        this.yakitFiyat = yakitFiyat;
    }

    /**
     * @return the personel
     */
    public List<Personel> getPersonel() {
        return personel;
    }

    /**
     * @param personel the personel to set
     */
    public void setPersonel(List<Personel> personel) {
        this.personel = personel;
    }

    /**
     * @return the kullananUct
     */
    public int getKullananUct() {
        return kullananUct;
    }

    /**
     * @param kullananUct the kullananUct to set
     */
    public void setKullananUct(int kullananUct) {
        this.kullananUct = kullananUct;
    }

    /**
     * @return the hizmetUct
     */
    public int getHizmetUct() {
        return hizmetUct;
    }

    /**
     * @param hizmetUct the hizmetUct to set
     */
    public void setHizmetUct(int hizmetUct) {
        this.hizmetUct = hizmetUct;
    }
    
    public List<Personel> personelListele(){
         
        if(this.personel==null){
            this.personel=new ArrayList<>();
        }
        
       return this.personel;
     }
    
}
