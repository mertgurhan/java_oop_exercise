/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev2;

/**
 *
 * @author mertgurhan
 */
public class Motor extends Arac{
    private boolean yankoltuk;
    public Motor(String Marka,int yil,int topspeed,boolean yankoltuk){
        super(Marka,yil,topspeed);
        this.yankoltuk=yankoltuk;
    }
    public boolean Yankoltuk(){
    return yankoltuk;
    }
    
    public void tekerlekHavayaKaldir(){
        System.out.println("Motor teker yapıyor");
    }
    public void sur(){
         System.out.println("Motor suruyor");
    }
}
