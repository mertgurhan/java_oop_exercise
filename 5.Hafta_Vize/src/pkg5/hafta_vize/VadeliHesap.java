/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.hafta_vize;

/**
 *
 * @author mertgurhan
 */
public class VadeliHesap extends Hesap{
    public int vade;
    public VadeliHesap(double bakiye,int vade){
        super(bakiye);
        this.vade=vade;
    }
@Override
    public void paraYatir(double miktar){
        bakiye+=miktar;
        System.out.print("miktar:"+miktar);
    }
    @Override
    public void paraCek(double miktar){
        
        if(vade>0){
            System.out.println("Vade süresi dolmadıgı icin cekemezsin");
        }
        else{
            
        
        if(bakiye>=miktar){
            bakiye-=miktar;
            System.out.println(miktar+"Hesaptan tl çekildi");
        }
        else{
            System.out.println("Bakiye yetersiz!");
        }
    }
}
     @Override
     public void bakiyeSorgula(){
        System.out.println(bakiye+"Bakiye");
     }
}

