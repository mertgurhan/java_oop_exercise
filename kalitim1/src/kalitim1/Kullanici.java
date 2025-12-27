/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalitim1;

/**
 *
 * @author mertgurhan
 */
public class Kullanici {
    public String Ad,Soyad,KullaniciTur;
    public void GirisYap(){
        System.out.println(this.KullaniciTur+""+this.Ad+""
                +this.Soyad+"Giris Yapti");
        
    }
    public void CikisYap(){
        System.out.println(this.KullaniciTur+""+this.Ad+""
                +this.Soyad+"Cikis Yapti");
    }
}
