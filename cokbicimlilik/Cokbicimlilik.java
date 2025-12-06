/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cokbicimlilik;

/**
 *
 * @author mertgurhan
 */
public class Cokbicimlilik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Cat cat1,cat2,cat3;
    cat1=new Cat("Tarcin",2);
    cat2=new VanCat("Mesir",4,true);
    cat3=new VanCat("Macun",4,false);
    
    
    cat1.ioCat();
    cat2.ioCat();
    cat3.ioCat();
    }
    
}
