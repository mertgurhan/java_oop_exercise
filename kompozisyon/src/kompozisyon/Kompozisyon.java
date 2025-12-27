/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kompozisyon;

/**
 *
 * @author mertgurhan
 */
public class Kompozisyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Araba araba =new Araba("togg","t10x",new Motor("160 kW"),new Direksiyon());
        araba.hareketeGec();
        araba.DonusYap("Sag");
    }
    
}
