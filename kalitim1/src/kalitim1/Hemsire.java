/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalitim1;

/**
 *
 * @author mertgurhan
 */
public class Hemsire extends Kullanici {
    public Hemsire(String Ad,String Soyad){
        
        this.Ad=Ad;
        this.Soyad=Soyad;
        this.KullaniciTur="Hemsire";
        
    }
    public void AsiYap(Hasta hasta){
        
        System.out.println(hasta.Ad+""+hasta.Soyad+"isimli hastaya"
        +"asi yapildi");
        
    }
    
    public void TahlilYap(Hasta hasta){
         System.out.println(hasta.Ad+""+hasta.Soyad+"isimli hastaya"
        +"tahlil yapildi");
    }
    public void KanTestiYap(Hasta hasta){
         System.out.println(hasta.Ad+""+hasta.Soyad+"isimli hastaya"
        +"kan testi yapildi");
         hasta.KanGrubu="ARh+";
          System.out.println(hasta.Ad+""+hasta.Soyad+"isimli hastanin"
        +"kan grubu:"+hasta.KanGrubu);
    }
}
