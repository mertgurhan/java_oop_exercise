/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filereader;
import java.io.*;
import java.nio.*;
/**
 *
 * @author mertgurhan
 */
public class Filereader {

    public Filereader(File dosya) {
    }

    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            
            File dosya=new File("D:\dosya.txt");
            
            
            Filereader dosyaokuyucu=new Filereader(dosya);
            System.out.println("Karakter okuma:");
            int i;
            while((i=dosyaokuyucu.read()!=-1)){
                System.out.println((char) i);
            }
            
            dosyaokuyucu.close();
            System.out.println("Dosya okuyuucu kapatildi");
            
            
            
            
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
