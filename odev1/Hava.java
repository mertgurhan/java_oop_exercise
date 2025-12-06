/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev1;

/**
 *
 * @author mertgurhan
 */
public class Hava implements Arac,Ucma {

    @Override
    public void haraketet(){
        System.out.println(" Ucak havada haraket ediyor");
        
    }
    @Override
    public void bakimYap(){
        System.out.println("Ucaga bakim yapiliyor");
    }
   
    @Override
    public void yakitAl(){
        System.out.println("Ucaga yakit aliniyor");
        
    }
    @Override
    public void uc(){
        System.out.println("Ucak cok yukseklerden ucuyor");
    }
    @Override
    public void turbulans(){
        System.out.println("Ucak turbulansa girdi");
    }
    @Override
    public void suzul(){
        System.out.println("Ucak sakin sakin suzuluyor");
    }
    @Override
    public void temizle(){
        System.out.println("Ucak alkolle temizleniyor");
    }
}
