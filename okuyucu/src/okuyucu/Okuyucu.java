/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package okuyucu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mertgurhan
 */
public class Okuyucu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        try{
        File dosya =new File("/Users/mertgurhan/Desktop/java.txt");
        FileReader dosyaOkuyucu=new FileReader(dosya);
        System.out.print("Karakter okuma:");
        int i;
        while((i=dosyaOkuyucu.read())!=-1){
            System.out.print((char)i);
        }
        
        dosyaOkuyucu.close();
        
        System.out.println("\nDosya okuyucu kapatildi");
        
    }catch(IOException e){
        System.out.println(e);
    }
    
    }
}
