/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev;

/**
 *
 * @author mertgurhan
 */
public class Gemi implements Arac {
    @Override
    public void haraketet(){
        System.out.println("Gemi suda haraket ediyor");
    }
    @Override
    public void bakimYap(){
        
        System.out.println("Gemiye Tershane'de bakim yapiliyor");
        
    }
    @Override
    public void yakitAl(){
        
        System.out.println("Gemiye mazot aliniyor");
        
    }
    @Override
    public void temizle(){
        System.out.println(" Gemi kabuklardan temizleniyor");
    }
}
