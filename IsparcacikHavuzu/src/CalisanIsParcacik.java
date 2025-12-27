/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mertgurhan
 */
public class CalisanIsParcacik implements Runnable {
    
    private String gorevAd;
    public CalisanIsParcacik(String gorevAd){
        this.gorevAd=gorevAd;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"is parcacigi"+gorevAd+"isini gerceklestiriyor");
        
        
        try{
            Thread.sleep(2000);//is parcacigi 2 sn uyur
        }
        catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName()+"is parcacigi"+gorevAd+"isini tamamladi");
        }
    }
}
