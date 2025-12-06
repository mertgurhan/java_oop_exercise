/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankacilik;

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
        System.out.println(miktar+"tl yatiirildi");
    }
    @Override
    public void paraCek(double miktar){
        if(miktar<bakiye){
            bakiye-=miktar;
            System.out.println(miktar+"tl çekildi");
        }
        else{
            System.out.println("Bakiye yetersiz");
        }
    }
    @Override
    public void bakiyeSorgula(){
        System.out.println(("Bakiye"+bakiye+"tl"));
    }
}
