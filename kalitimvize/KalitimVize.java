/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalitimvize;

/**
 *
 * @author mertgurhan
 */
public class KalitimVize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Araba araba=new Araba("Toyota","Corolla",2013,1600,"Benzin");
        araba.bilgiGoster();
        araba.hizlan();
        araba.dur();
        araba.parkEt();
       // araba.setMotorHacmi();
    }
    
}
