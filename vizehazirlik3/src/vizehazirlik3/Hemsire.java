/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vizehazirlik3;

/**
 *
 * @author mertgurhan
 */
public class Hemsire extends Kullanici {
   public Hemsire(String Ad,String Soyad){
       this.Ad=Ad;
       this.Soyad=Soyad;
       this.KullaniciTur="hemsire";
   }
   
   public void AsiYap(Hasta hasta){
       
        System.out.println(hasta.Ad+""+hasta.Soyad+""+"asi yapildi");
       
       
   }
   public void TahlilYap(Hasta hasta){
        System.out.println(hasta.Ad+""+hasta.Soyad+""+"tahlil yapildi");
   }
   
   public void KanTestiYap(Hasta hasta){
        System.out.println(hasta.Ad+""+hasta.Soyad+""+"kan testi yapildi");
   
   
   hasta.KanGurubu="ABRh+";
    System.out.println(hasta.Ad+" "+hasta.Soyad+""+"isimli hastanin"+"kan grubu:"+hasta.KanGurubu);
   }
   
   public void SaxoCek(Doktor doktor){
       System.out.print(this.Ad+" "+this.Soyad+doktor.Ad+doktor.Soyad+"'a sakso çekiyor");
   }
   
   
   
}
