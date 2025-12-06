/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.hafta_vize;

/**
 *
 * @author mertgurhan
 */
public class TasarrufHesap extends Hesap {
    
    public TasarrufHesap(double bakiye){
        super(bakiye);
    }
    @Override
    public void paraYatir(double miktar){
        bakiye+=miktar;
        System.out.println(miktar+"tl yatirildi");
    }
    @Override 
    public void paraCek(double miktar){
        bakiye-=miktar;
        
        if(bakiye>=miktar){
        System.out.println(miktar+"tl cekildi");
    }
      else{
            System.out.println("Bakiye yetersiz!");
        }
    }
    @Override
    public void bakiyeSorgula(){
        System.out.println(bakiye+"Bakiye");
    }
    
    
   }
    
    
    
   

