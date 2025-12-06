/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ısparcacikoncelik;

/**
 *
 * @author mertgurhan
 */
public class Test implements Runnable{
    String name;
    public Test(String threadname){
        name=threadname;
    }
    public void run(){
        try{
            for(int i=5; i>0;i--){
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }
            
        }
        catch(InterruptedException e){
            System.out.println(name+"Hata");
        }
        System.out.println(name+"bitiriliyor");
    }
}
