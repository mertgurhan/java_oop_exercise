/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankacilik;

/**
 *
 * @author mertgurhan
 */
public class Bankacilik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TasarrufHesap tasarrufHesap=new TasarrufHesap(1000);
        tasarrufHesap.paraYatir((500));
        tasarrufHesap.paraCek(200);
        tasarrufHesap.bakiyeSorgula();
 
    //cari hesap örneği nedir öğren !!
    CariHesap cariHesap=new CariHesap(2000);
    cariHesap.paraYatir(1000);
    cariHesap.paraCek(3000);
    cariHesap.bakiyeSorgula();
   
    
    //vadeli hesap  nedir öğren
    VadeliHesap vadeliHesap=new VadeliHesap(5000,12);
    
    vadeliHesap.paraYatir(2000);
    vadeliHesap.paraCek(3000);
    
    vadeliHesap.bakiyeSorgula();
    
    }
    
    
    
    
}
