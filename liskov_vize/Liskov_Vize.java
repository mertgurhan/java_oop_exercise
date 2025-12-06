/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liskov_vize;

/**
 *
 * @author mertgurhan
 */
public class Liskov_Vize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sekil sekil1=new Dikdortgen(5.0,3.0);
        Sekil sekil2=new Daire(2.5);
        
        sekil1.bilgiGoruntule();
        
        System.out.println("Alan"+sekil1.alanHesapla());
        System.out.println();
        
        sekil2.bilgiGoruntule();
        System.out.println("Alan"+sekil2.alanHesapla());
 ;
    }
    
}
