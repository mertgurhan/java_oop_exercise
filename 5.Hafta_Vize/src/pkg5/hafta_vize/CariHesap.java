/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.hafta_vize;

/**
 *
 * @author mertgurhan
 */
public class CariHesap extends Hesap {
    
    public CariHesap(double bakiye){
        super(bakiye);
    }
    @Override
    public void paraYatir(double miktar){
        bakiye+=miktar;
        System.out.print("miktar:"+miktar);
    }
    @Override
    public void paraCek(double miktar){
        
        if(bakiye>=miktar){
            bakiye-=miktar;
            System.out.println(miktar+"Hesaptan tl çekildi");
        }
        else{
            System.out.println("Bakiye yetersiz!");
        }
        
    }
    @Override
    public void bakiyeSorgula(){
        System.out.println("Bakiyeniz:"+bakiye);
    }
    
    
}
