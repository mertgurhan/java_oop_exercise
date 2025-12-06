/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ısparcacik1;

/**
 *
 * @author mertgurhan
 */
class MyThread extends Thread{
    public void run(){
        System.out.println("Bu bir is parcacigidir");
    }
}
public class Isparcacik1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MyThread  thread=new MyThread();
    thread.start();
    }
    
}

