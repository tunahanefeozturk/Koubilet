/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolab_2;

/**
 *
 * @author oztur
 */
public class Koltuk {
    private int koltukNo;
    private boolean doluluk;

    /**
     * @return the koltukNo
     */
    public int getKoltukNo() {
        return koltukNo;
    }

    /**
     * @param koltukNo the koltukNo to set
     */
    public void setKoltukNo(int koltukNo) {
        this.koltukNo = koltukNo;
    }

    /**
     * @return the doluluk
     */
    public boolean isDoluluk() {
        return doluluk;
    }

    /**
     * @param doluluk the doluluk to set
     */
    public void setDoluluk(boolean doluluk) {
        this.doluluk = doluluk;
    }

    @Override
    public String toString() {
        String dol=new String();
        if(this.doluluk){
            dol="dolu";
        }else {
            dol="boş";
        }
        
        return this.koltukNo+"  -  "+dol ;
    }
    
    
}
