/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.entity;

import com.mycompany.prolab_2.interfaces.ILoginable;

/**
 *
 * @author oztur
 */
public   class User implements ILoginable {
    private Long id;
    private String kullaniciAdi;
    private String sifre;
    
    public User(){}
    
    public User(String kullaniciAdi,String sifre){
        this.kullaniciAdi=kullaniciAdi;
        this.sifre=sifre;
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
     * @return the ad
     */
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    /**
     * @param ad the ad to set
     */
    public void setKullaniciAdi(String ad) {
        this.kullaniciAdi = ad;
    }

   
    /**
     * @return the sifre
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return this.id+" - "+this.kullaniciAdi; 
    }

   
}
