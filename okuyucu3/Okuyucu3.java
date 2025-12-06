/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package okuyucu3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 *
 * @author mertgurhan
 */
public class Okuyucu3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           try{
            
            File dosya =new File("/Users/mertgurhan/Desktop/java.txt");
            
            FileReader dosyaOkuyucu=new FileReader(dosya,Charset.forName("UTF-8"));
            System.out.println("Dizi ile okuma:");
            
            char[]charArray=new char[10];
            
            dosyaOkuyucu.read(charArray);
            System.out.println(charArray);
            
            dosyaOkuyucu.close();
        System.out.println("\nDosya okuyucu kapatildi");
        }  catch(IOException e){
            System.out.println(e);
            
           
        }
    }
    }
    

