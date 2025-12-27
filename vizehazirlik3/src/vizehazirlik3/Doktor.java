/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vizehazirlik3;

/**
 *
 * @author mertgurhan
 */
public class Doktor extends Kullanici {
    public String Bolum;
    public Doktor(String Ad,String Soyad,String Bolum){
        
        this.Ad=Ad;
        this.Soyad=Soyad;
        this.Bolum=Bolum;
        this.KullaniciTur="Doktor";
    }
    public void MuayaneYap(Hasta hasta){
        System.out.println(hasta.Ad+""+hasta.Soyad+""+this.Ad+this.Soyad+"isimli doktor muayen etti");
    
    }


public void IlacYaz(Hasta hasta){
     System.out.println(hasta.Ad+""+hasta.Soyad+""+"ilac yazdildi");
}
    
public void TedaviYap(Hasta hasta){
    
      System.out.println(hasta.Ad+""+hasta.Soyad+""+"hastaya tedavi yapildi");
     
}
}
