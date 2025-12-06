/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev2;

/**
 *
 * @author mertgurhan
 */
public class Bisiklet extends Arac{
    private int vites;
    public Bisiklet(String Marka,int yil,int topspeed,int vites){
        super(Marka,yil,topspeed);
        this.vites=vites;
        
    }
    public int getvites(){
        return vites;
    }
    public void pedalCevir(){
        System.out.println("Bisiklet pedallari ceviriyor");
        
    }
    public void zilCal(){
        System.out.println("Bisiklet zil caliyor");
    }
    
}
