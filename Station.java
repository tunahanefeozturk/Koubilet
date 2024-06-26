/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2;

/**
 *
 * @author oztur
 */
public class Station {
    
    private String ad;
    private Long id;
    
    public Station(String ad){
        this.ad=ad;
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return ad;
    }

    /**
     * @return the sid
     */
    public Long getId() {
        return id;
    }

    /**
     * @param sid the sid to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    
}
