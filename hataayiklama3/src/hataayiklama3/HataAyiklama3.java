/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hataayiklama3;

/**
 *
 * @author mertgurhan
 */
public class HataAyiklama3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exception e1=new Exception("Hata1");
        StackTraceElement[] hataIzleme=e1.getStackTrace();
        for(StackTraceElement st:hataIzleme){
            System.out.println("Hata Dosyasi:"+st.getFileName());
            System.out.println("Hata satiri:"+st.getLineNumber());
            System.out.println("Hata metodu:"+st.getMethodName());
            System.out.println("Hata Sinifi:"+st.getClass());
        }
    }
    
}
