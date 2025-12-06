/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankacilik;

/**
 *
 * @author mertgurhan
 */
public class VadeliHesap extends Hesap {
    private int vade;

public VadeliHesap(double bakiye,int vade){
    super(bakiye);
    this.vade=vade;
    
}
@Override
public void paraYatir(double miktar){
    bakiye+=miktar;
    System.out.println(miktar+"tl para yatirildi");
}
@Override
public void paraCek(double miktar){
    
    if(vade>0){
         System.out.println("vade süresi dolmadığı için para çekilemez");
    }
    else{
    
    
    if(miktar<=bakiye){
        bakiye-=miktar;
        System.out.println(miktar+"tl para cekildi");
        
        
    }
    else{
         System.out.println("Hesap bakiyesi yetersiz");
    }
    }
    
}
@Override
public void bakiyeSorgula(){
     System.out.println("Bakiye:"+bakiye+"tl");
}

}
