/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hataayiklama5;

/**
 *
 * @author mertgurhan
 */
public class HataAyiklama5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hesaplayici hesap=new Hesaplayici();
        try{
            int sonuc=hesap.toplama(10,1);
            System.out.println("Sonuc:"+sonuc);
        }
        catch(AritmetikToplaHatasiException e){
            System.out.println("Hata:"+e.getMessage());
            
        }
        catch(ArithmeticException e){
            System.out.println("Aritmetik Hata:"+e.getMessage());
        }
    }
    
}
