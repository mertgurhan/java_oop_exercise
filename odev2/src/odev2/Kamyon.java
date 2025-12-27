/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev2;

/**
 *
 * @author mertgurhan
 */
public class Kamyon extends Arac {
    private double yukKapasite;
    public Kamyon(String Marka,int yil,int topspeed,double yukKapasite){
        super(Marka,yil,topspeed);
        this.yukKapasite=yukKapasite;
    }
    public double getyukKapasite(){
        return yukKapasite;
    }
    public void yukYukle(){
        System.out.println("Kamyon yuk yukluyor");
    }
    public void cek(){
        System.out.println("Kamyon cekiyor");
    }
}
