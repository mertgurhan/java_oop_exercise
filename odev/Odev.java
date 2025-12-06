/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odev;

/**
 *
 * @author mertgurhan
 */
public class Odev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Araba araba = new Araba();
        Ucak ucak  = new Ucak();
        Tren tren  = new Tren();
        Gemi gemi  = new Gemi();
        
        araba.haraketet();
        araba.bakimYap();
        araba.yakitAl();
        araba.temizle();
     System.out.println("-----------------------------");
        ucak.haraketet();
        ucak.bakimYap();
        ucak.yakitAl();
        ucak.uc();
        ucak.suzul();
        ucak.turbulans();
        ucak.temizle();
     System.out.println("-----------------------------"); 
        gemi.haraketet();
        gemi.bakimYap();
        gemi.yakitAl();
        gemi.temizle();
    System.out.println("-----------------------------");    
        tren.haraketet();
        tren.bakimYap();
        tren.yakitAl();
        tren.temizle();
        
    }
    
    }
    

