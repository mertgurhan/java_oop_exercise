/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev2;

/**
 *
 * @author mertgurhan
 */
public class Arac {
    private String Marka;
    private int yil;
    private final int topspeed;
    
    public Arac(String Marka,int yil,int topspeed){
        
        this.Marka=Marka;
        this.yil=yil;
        this.topspeed=topspeed;
    }
    public int getYil(){
        return yil;
    }
    public int getTopspeed(){
        return topspeed;
    }
    public final void calis(){
        System.out.println("Arac calisiyor");
    }
    public String getMarka(){
        return Marka;
    }
}
