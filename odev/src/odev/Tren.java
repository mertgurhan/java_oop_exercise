/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev;

/**
 *
 * @author mertgurhan
 */
public class Tren implements Arac {
      @Override
    public void haraketet(){
        
        System.out.println("Tren raylarda hareket ediyor");
        
    }
    @Override
    public void bakimYap(){
        System.out.println("Tren'e istasyonda bakim yapiliyor");
        
    }
   @ Override
    public void yakitAl(){
        
        System.out.println("Tren'e mazot aliniyor");
        
    }
    @Override
    public void temizle(){
        System.out.println("Tren su ile temizleniyor");
    }
}
