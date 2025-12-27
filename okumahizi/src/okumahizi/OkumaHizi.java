/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package okumahizi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;
/**
 *
 * @author mertgurhan
 */
public class OkumaHizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        try { 
            File file =new File("/Users/mertgurhan/Desktop/metin.txt");
            Scanner okuyucu=new Scanner(file,Charset.forName("UTF-8"));
            int boslukSayisi=0;
            while(okuyucu.hasNextLine()){
                String satir=okuyucu.nextLine();
                boslukSayisi+=satir.split("").length-1;
            }
            okuyucu.close();
            System.out.println("Dosyadaki toplam kelime sayisi:"+(boslukSayisi+1));
            System.out.println("Okuma süresi "+(((boslukSayisi+1)*60)/160)+"saniye");
        }
    catch(FileNotFoundException e){
    System.out.println("Dosya bulunamadi"+e.getMessage());
}
    
}
}