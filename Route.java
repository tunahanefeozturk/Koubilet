/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2;

/**
 *
 * @author oztur
 */
public class Route {
    private Long id;
    private String kalkis;
    private String varis;
    private int mesafe;
    
    public Route(){}
    
    public Route(String kalkis,String varis){
       
        this.kalkis = kalkis;
        this.varis = varis;
    }
    public Route(String kalkis,String varis,int mesafe){
       
        this.kalkis = kalkis;
        this.varis = varis;
        this.mesafe = mesafe;
      
    }
    
    
    public String getVaris() {
        return varis;
    }

   
    public void setVaris(String varıis) {
        this.varis = varis;
    }

    /**
     * @return the mesafe
     */
    public int getMesafe() {
        return mesafe;
    }

    /**
     * @param mesafe the mesafe to set
     */
    public void setMesafe(int mesafe) {
        this.mesafe = mesafe;
    }

 
    /**
     * @param kalkis the kalkis to set
     */
    public void setKalkis(String kalkis) {
        this.kalkis = kalkis;
    }

    

    /**
     * @return the kalkis
     */
    public String getKalkis() {
        return kalkis;
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
    
}
