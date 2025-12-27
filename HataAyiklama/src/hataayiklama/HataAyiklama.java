/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hataayiklama;

/**
 *
 * @author mertgurhan
 */
public class HataAyiklama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exception e1=new Exception();
        Exception e2=new Exception("Hata mesaji");
        Exception e3=new Exception("Yeni hata mesaji",e2);
        Exception e4=new Exception(e3);
        String mesaj=e1.getMessage();
        System.out.println(mesaj);
        mesaj=e2.getMessage();
        System.out.println(mesaj);
        mesaj=e3.getMessage();
        System.out.println(mesaj);
        mesaj=e4.getMessage();
        System.out.println(mesaj);
               
    }
    
}
