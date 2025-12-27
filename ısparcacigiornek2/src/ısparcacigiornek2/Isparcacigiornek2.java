/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ısparcacigiornek2;

/**
 *
 * @author mertgurhan
 */
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("bu bir is parcacigi ornegidir!");
    }
}
public class Isparcacigiornek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Thread thread=new Thread(new MyRunnable());
       thread.start();
        // TODO code application logic here
    }
    
}
