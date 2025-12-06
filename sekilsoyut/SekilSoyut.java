/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sekilsoyut;

/**
 *
 * @author mertgurhan
 */
public class SekilSoyut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sekil[] sekiller=new Sekil[2];
        sekiller[0]=new Ucgen();
        sekiller[1]=new Kare();
        
        for(Sekil sekil: sekiller){
            sekil.ciz();
        }
    }
    
}
