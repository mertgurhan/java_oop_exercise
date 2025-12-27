/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalitimvize;

/**
 *
 * @author mertgurhan
 */
public class Arac {
    
   private final String marka;
   private final String model;
   private final int uretimYili;
   
   //yapici metod
   public Arac(String marka,String model,int uretimYili){
       
       this.marka=marka;
       this.model=model;
       this.uretimYili=uretimYili;
       
       
   }
   
   public final void bilgiGoster(){
       System.out.println("Marka"+marka+ "Model"+model+"Uretim Yil"+uretimYili);
   }
   
   public void sur(){
       System.out.println("Arac suruluyor");
       
   }
   public void dur(){
       System.out.println("Arac duruuor");
   }
   public void yavasla(){
       System.out.println("Arac yavasliyor");
   }
}
