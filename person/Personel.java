/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.person;



/**
 *
 * @author oztur
 */
public class Personel extends Person {
    private String gorev;


    public Personel(){}
    public Personel(String grv){
        this.gorev=grv;
    }
    
    /**
     * @return the görev
     */
    public String getGorev() {
        return gorev;
    }

    /**
     * @param gorev the görev to set
     */
    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

}
