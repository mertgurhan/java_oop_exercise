/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odev1;

/**
 *
 * @author mertgurhan
 */
public class Odev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kara araba = new Kara();
        Hava ucak  = new Hava();
        Tren tren  = new Tren();
        Gemi gemi  = new Gemi();
        
        araba.haraketet();
        araba.bakimYap();
        araba.yakitAl();
        araba.temizle();
        
        ucak.haraketet();
        ucak.bakimYap();
        ucak.yakitAl();
        ucak.uc();
        ucak.suzul();
        ucak.turbulans();
        ucak.temizle();
        
        gemi.haraketet();
        gemi.bakimYap();
        gemi.yakitAl();
        gemi.temizle();
        
        tren.haraketet();
        tren.bakimYap();
        tren.yakitAl();
        tren.temizle();
        
    }
    
}
