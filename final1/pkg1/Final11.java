/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final1.pkg1;
import java.nio.*;
import java.io.*;
/**
 *
 * @author mertgurhan
 */
public class Final11 {

    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  try{
    
try{
    File dosya=new File("/Users/mertgurhan/Desktop/java oop/java.txt");
    FileReader dosyaOkuyucu=new FileReader(dosya);
    
  
System.out.println("Karakter okuma:");
int i;
    while((i=dosyaOkuyucu.read())!=-1){
    System.out.print((char)i);
    
    }
dosyaOkuyucu.close();
System.out.println("Dosya okuycu kapatildi");

}
    catch(IOException e){
    System.out.println(e);
}
    
    
    
    
    }
    
}
