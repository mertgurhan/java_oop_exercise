/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final21;
import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;

/**
 *
 * @author mertgurhan
 */
public class Final21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
            File dosya=new File("/Users/mertgurhan/Desktop/java oop/java.txt");
            BufferedReader dosyaokuyucu=new BufferedReader(new FileReader(dosya,Charset.forName("UTF-8")));
      
            
            String line;
            while((line=dosyaokuyucu.readLine())!=null){
                System.out.println(line);
            }
            
           dosyaokuyucu.close();
        }
    
    catch(IOException e){
    System.out.println(e);
}
    }
}

