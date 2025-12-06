/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package silinecek;

import java.io.*;
/**
 *
 * @author mertgurhan
 */
public class Silinecek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    File dosya=new File("silinecekDosya.txt");
    
    if(dosya.delete()){
        
        System.out.println("Dosya silindi"+dosya.getName());
    }
    else{
        System.out.println("Dosya silinemedi");
    }
    
    }
    
    
}
