/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.hafta_vize;

/**
 *
 * @author mertgurhan
 */
public class Hafta_Vize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TasarrufHesap tasarrufhesap=new TasarrufHesap(1000);
        tasarrufhesap.paraYatir(1000);
        tasarrufhesap.paraCek(200);
        tasarrufhesap.bakiyeSorgula();
        
        
        
        CariHesap cariHesap =new CariHesap(1000);
        cariHesap.paraYatir(10000);
        cariHesap.paraCek(200);
        cariHesap.bakiyeSorgula();
        
        
        
        
        VadeliHesap vadeli=new VadeliHesap(200,12);
        vadeli.paraCek(5);
        vadeli.paraYatir(40000);
        vadeli.bakiyeSorgula();
    }
    
}
