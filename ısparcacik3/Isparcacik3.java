/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ısparcacik3;

/**
 *
 * @author mertgurhan
 */
public class Isparcacik3 {
       
    public static void main(String[] args) {
       
    Thread  thread=new Thread(()->{
        System.out.println("Bu bir is parcacigidir");
    });
    thread.start();
    }
    
}
