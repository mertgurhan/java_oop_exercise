/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankacilik;

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
         System.out.println(miktar+"tl para yatirildi");
    }
    @Override
    public void paraCek(double miktar){
        if(miktar<=bakiye){
            bakiye-=miktar;
             System.out.println(miktar+"tl para cekildi");
        }
        else{
             System.out.println("hesapta o kadar para yok");
        }
    }
    @Override
    public void bakiyeSorgula(){
         System.out.println("bakiye:"+bakiye+"tl ");
    }
    
}
