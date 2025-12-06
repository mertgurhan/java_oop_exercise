/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ısparcacik2;

/**
 *
 * @author mertgurhan
 */
public class Isparcacik2 {
       public static void main(String[] args) {
        // TODO code application logic here
    Thread  thread=new Thread(new MyRunnable());
    thread.start();
    }
}
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Bu bir is parcacigidir");
    }
}
