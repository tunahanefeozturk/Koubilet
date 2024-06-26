/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2;

import java.util.LinkedList;

/**
 *
 * @author oztur
 */
public class Trip {

    private int seferNo;
    private LinkedList<Station> yol;
    private int gün;
    


    public Trip(int seferNo, LinkedList<Station>yol){
        this.seferNo=seferNo;
         this.yol=yol;
    }
    
     public Trip(int seferNo){
        this.seferNo=seferNo;
    }
    
     public Trip(LinkedList<Station> yol){
        this.yol=yol;
    }
    
    public Trip(LinkedList<Station> yol,int gün){
       
        this.yol = yol;
        this.gün = gün;
        
    }
  
    /**
     * @return the gün
     */
    public int getGün() {
        return gün;
    }

    /**
     * @param gün the gün to set
     */
    public void setGün(int gün) {
        this.gün = gün;
    }

    /**
     * @return the yol
     */
    public LinkedList<Station> getYol() {
        if(this.yol==null){
            this.yol=new LinkedList<Station>();
            
        }
        
        return yol;
    }

    /**
     * @param yol the yol to set
     */
    public void setYol(LinkedList<Station> yol) {
        this.yol = yol;
    }

    @Override
    public String toString() {
        
         String tstr=new String();
         tstr=tstr+ getSeferNo();
        for (int i = 0; i < getYol().size(); i++) {
         
            tstr=tstr+" - "+getYol().get(i);
            
        }
        
        return tstr ;
    }
    
  

    /**
     * @return the seferNo
     */
    public int getSeferNo() {
        return seferNo;
    }

    /**
     * @param seferNo the seferNo to set
     */
    public void setSeferNo(int seferNo) {
        this.seferNo = seferNo;
    }

 
    
    
    
}
