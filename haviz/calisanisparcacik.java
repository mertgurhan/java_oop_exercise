/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haviz;

/**
 *
 * @author mertgurhan
 */
public class calisanisparcacik  implements Runnable{
    
    private  String gorevAd;
    public calisanisparcacik(String gorevAd){
    this.gorevAd=gorevAd;
}

@Override
public void run(){
    System.out.println(Thread.currentThread().getName()+"is parcacigi"+gorevAd+"isini gerceklestiriyor");
 try{
     Thread.sleep(1000);
     
 }   
 catch(InterruptedException e){
     System.out.println(Thread.currentThread().getName()+"is parcacigi"+gorevAd +"isini tamamladi");
 }
}

}
