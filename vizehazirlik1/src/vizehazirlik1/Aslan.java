/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vizehazirlik1;

/**
 *
 * @author mertgurhan
 */
public class Aslan implements KosanHayvan,SesliHayvan {
    
 
    @Override
    public void Kos(){
        System.out.println("Aslan kosuyor");
    }
    
    
       @Override
    public void SesCikar(){
        System.out.println("Rooooar");
        
    }
}
