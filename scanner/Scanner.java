/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;

/**
 *
 * @author mertgurhan
 */
public class Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      try{
        File dosya=new File("/Users/mertgurhan/Desktop/java.txt");
        Scanner okuyucu=new Scanner(dosya,Charset.forName("UTF-8"));
        while(okuyucu.hasNextLine()){
            String veri=okuyucu.nextLine();
            System.out.println(veri);
        }
        okuyucu.close();
    }
    
    catch(FileNotFoundException e){
    System.out.println("An error occured");
    e.printStackTrace();
}

    }
}