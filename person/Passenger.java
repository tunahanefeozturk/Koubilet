/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.person;

import com.mycompany.prolab_2.Koltuk;


/**
 *
 * @author oztur
 */
public class Passenger extends Person{
    private Long id;
    private String tc;
    private int yas;
    private Koltuk koltuk;
    
    public Passenger(){}
    
    public Passenger(String ad,String soyad,String tc,int yas){
        super.setAd(ad);
        super.setSoyad(soyad);
        this.tc=tc;
        this.yas=yas;
    }

    public Passenger(String ad,String soyad,String tc,int yas,Koltuk koltuk){
        super.setAd(ad);
        super.setSoyad(soyad);
        this.tc=tc;
        this.yas=yas;
        this.koltuk=koltuk;
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
     * @return the tc
     */
    public String getTc() {
        return tc;
    }

    /**
     * @param tc the tc to set
     */
    public void setTc(String tc) {
        this.tc = tc;
    }

    /**
     * @return the yas
     */
    public int getYas() {
        return yas;
    }

    /**
     * @param yas the yas to set
     */
    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ad Soyad :"+this.getAd()+" "+this.getSoyad()+"  T.C no : "+this.getTc()+"  Yaş: "+this.getYas(); 
    }

    /**
     * @return the koltuk
     */
    public Koltuk getKoltuk() {
        return koltuk;
    }

    /**
     * @param koltuk the koltuk to set
     */
    public void setKoltuk(Koltuk koltuk) {
        this.koltuk = koltuk;
    }
    
    
}
