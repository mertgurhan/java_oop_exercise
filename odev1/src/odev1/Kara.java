/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev1;

/**
 *
 * @author mertgurhan
 */
public class Kara implements Arac {
    @Override
    public void haraketet(){
        System.out.println("Araba karada hareket ediyor");
    }
    @Override
    public void yakitAl(){
        
        System.out.println("Araba yakit aliyor");
    }
    @Override
    public void bakimYap(){
        
        System.out.println("Arabaya bakim yapiliyor");
        
    }
    @Override
    public void temizle(){
        System.out.println("Araba köpükle temizleniyor");
    }
    
}
