/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalsilici;
import java.io.*;
import java.nio.*;
/**
 *
 * @author mertgurhan
 */
public class FinalSilici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File dosya=new File("/Users/mertgurhan/Desktop/java oop/java_yaz.txt");
    
    if(dosya.delete()){
        System.out.println("Dosya silindi"+dosya.getName());
    }
    
    else{
        System.out.println("Dosya silinemedi");
    }
    }
    
}
