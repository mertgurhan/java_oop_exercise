/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hataayiklama2;

/**
 *
 * @author mertgurhan
 */
public class HataAyiklama2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exception e1=new Exception();
        Exception e2=new Exception("Hata mesaji",e1);
        Exception e3=new Exception("Yeni hata mesaji",e2);
        e3.printStackTrace();//bunu araştır
    }
    
}
