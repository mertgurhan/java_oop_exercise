/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final12;
import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
/**
 *
 * @author mertgurhan
 */
public class Final12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            File dosya=new File("/Users/mertgurhan/Desktop/java oop/java.txt");
            
            FileReader dosyaokuyucu=new FileReader(dosya,Charset.forName("UTF-8"));
            System.out.println("Karakter okuyucu");
            int i;
            while((i=dosyaokuyucu.read())!=-1){
                System.out.println((char)i);
            }
            
            dosyaokuyucu.close();
            System.out.println("\n Dosya okuyucu kapatildi");
            
        }
        catch(IOException e){
        System.out.println(e);
    }
    }
    
}
