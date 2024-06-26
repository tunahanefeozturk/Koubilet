/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2.entity;



/**
 *
 * @author oztur
 */
public class Admin extends User{
     public static int bedel=1000;  
    public static String adminAd="admin";
    public static String adminSifre="admin123";
    
 
    public static int fiyatBelirle(int fiyat){
      bedel=fiyat;
        
        return bedel;
    }

   
    
}
