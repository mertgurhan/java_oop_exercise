/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ısparcacikoncelik;

/**
 *
 * @author mertgurhan
 */
public class IsparcacikOncelik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test test1=new Test("1. is parcacigi =>");
        Test test2=new Test("2. is parcacigi =>");
    
        Thread thread=new Thread(test1);
        Thread thread1=new Thread(test2);
            
        thread.start();
        thread1.start();
    
        
        try{
            Thread.sleep(1000);
            
        }
        catch(InterruptedException e){
            System.out.println("Hata");
        }
        System.out.println("Thread bitti");
    }
    
}
