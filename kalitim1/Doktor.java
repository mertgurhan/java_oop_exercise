/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalitim1;

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
        
        System.out.println(hasta.Ad + "" + hasta.Soyad+"isimli hastayi"
        +""+this.Ad+""+this.Soyad+"isimli doktor muayne etmiştir");
        
    }
    public void IlacYaz(Hasta hasta){
        
        
        System.out.println(hasta.Ad + ""+hasta.Soyad+"isimli hastaya ilac yazdi");
        
    }
    public void TedaviYap(Hasta hasta){
        System.out.println(hasta.Ad+""+hasta.Soyad+"isimli hastaya tedavi yapildi");
    }
}
    
    

