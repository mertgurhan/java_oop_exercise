/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferreader;
import java.nio.Buffer;

/**
 *
 * @author mertgurhan
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
public class BufferReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        File dosya =new File("/Users/mertgurhan/Desktop/java.txt");
        
        BufferedReader okuyucu=new BufferedReader(new FileReader(dosya,Charset.forName("UTF-8")));
   
    String line;
    while((line=okuyucu.readLine())!=null){
        System.out.println(line);
    }
    okuyucu.close();
        }
    catch(IOException e){
    System.out.println(e);
}
    
    }
}
