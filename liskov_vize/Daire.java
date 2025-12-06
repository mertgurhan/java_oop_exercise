/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liskov_vize;

/**
 *
 * @author mertgurhan
 */
public class Daire  extends Sekil{
   private double cap;
   public Daire(double radius){
       this.cap=radius;
   }
   @Override
   public double alanHesapla(){
       return Math.PI*cap*cap;
   }
   @Override 
   public void bilgiGoruntule(){
       System.out.print(("Daire yaricapi"+cap));
   }
    
   
}
