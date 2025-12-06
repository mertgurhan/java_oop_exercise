/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hataayiklama4;

/**
 *
 * @author mertgurhan
 */
public class HataAyiklama4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int sonuc=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Bir matematik hatasi oluştu"+e.getMessage());
        }
        finally{
            System.out.println("İslem tamamlandi!");
        }
    }
    
}
