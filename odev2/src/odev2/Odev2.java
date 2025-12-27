/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odev2;

/**
 *
 * @author mertgurhan
 */
public class Odev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Araba araba =new Araba("Toyota",2013,160,5,true);
        Motor motor=new Motor("BMW",2022,299,false);
        Kamyon kamyon=new Kamyon("BMC",1999,100,5000.0);
        Bisiklet bisiklet=new Bisiklet("Salcano",2023,30,24);
  
    
    System.out.println("Araba:"+araba.getMarka()+",yil:"+araba.getYil()+
            ",Maksimum Hiz:"+araba.getTopspeed()+"km/h"+",Kapilar:"+araba.getKapi()+
            ",Donusturelebilir:"+araba.Donus());
   
    araba.calis();
    araba.kornacal();
    araba.sur();
   
    
   
System.out.println("\nMotosiklet: " + motor.getMarka() + ", Yıl: " + motor.getYil() +
                ", Maksimum Hız: " + motor.getTopspeed() +"km/h" +", Yan Koltuk: " + motor.Yankoltuk());
    
   
    
        motor.calis();
        motor.tekerlekHavayaKaldir();
        motor.sur();
    
    System.out.println("\nKamyon: " + kamyon.getMarka() + ", Yıl: " + kamyon.getYil() +
                ", Maksimum Hız: " + kamyon.getTopspeed() +"km/h"+ ", Yük Kapasitesi: " + kamyon.getyukKapasite()+"kg");
        kamyon.calis();
        kamyon.yukYukle();
        kamyon.cek();
    
           System.out.println("\nBisiklet: " + bisiklet.getMarka() + ", Yıl: " + bisiklet.getYil() +
                ", Maksimum Hız: " + bisiklet.getTopspeed() +"km/h" +", Vitesler: " + bisiklet.getvites());
       
           
        bisiklet.calis();
        bisiklet.pedalCevir();
        bisiklet.zilCal();

    
    
    }
    
}
