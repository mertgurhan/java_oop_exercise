/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final23;
import java.io.*;
import java.nio.*;
/**
 *
 * @author mertgurhan
 */
public class Final23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            
            File dosya=new File("/Users/mertgurhan/Desktop/java oop/java_yaz.txt");
            
            if(dosya.createNewFile()){
                System.out.println("Dosya olusturuldu"+dosya.getName());
            }
            FileWriter yazici=new FileWriter(dosya);
            yazici.write("Bu dosyaya yazilan metin");
            yazici.close();
            
            
        }
        catch(Exception e){
            System.out.println("Bir hata olustu");
            e.printStackTrace();
        }
    }
    
}
