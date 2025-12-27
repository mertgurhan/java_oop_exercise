/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalitim3;

/**
 *
 * @author mertgurhan
 */
public class Araba  extends Arac {
    public Araba(String PlakaNo){
        
        super(PlakaNo); 
    }
    @Override
    public void motorCalistir(String araba){
        
        
        super.motorCalistir(araba);
        
    }
    
    public void guneslikAc(){
        
        
        System.out.println(super.PlakaNo+"plakalı"+super.model+"model"
        +"guneslik acildi");
        
        
    }
}
