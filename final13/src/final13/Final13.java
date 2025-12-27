/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final13;
import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;

/**
 *
 * @author mertgurhan
 */
public class Final13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            
            File dosya=new File("/Users/mertgurhan/Desktop/java oop/java.txt");
            FileReader dosyaokuyucu=new FileReader(dosya,Charset.forName("UTF-8"));
            
            System.out.println("Dizi ile okuma");
            char[] charArray=new char[10];
            
            dosyaokuyucu.read(charArray);
            System.out.println(charArray);
            
            
            
            dosyaokuyucu.close();
            System.out.println("Dosya okuyucu kapatiliyor");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
