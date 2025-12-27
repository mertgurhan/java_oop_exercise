/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructer_example;

/**
 *
 * @author mertgurhan
 */
public class Constructer_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat cat1=new Cat("Tarcin","yellow",2,3);
        
         System.out.println(cat1.name);
        
         cat1.setAge(3);
         System.out.println(cat1.getAge());
    }
    
}
