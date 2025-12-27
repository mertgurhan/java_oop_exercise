/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pgmdosyaokuyucu;
import java.io.*;
/**
 *
 * @author mertgurhan
 */
public class PGMDosyaOkuyucu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String dosyaYolu="/Users/mertgurhan/Desktop/PGM/coins.ascii.pgm";
        
        
        try(BufferedReader okuyucu =new BufferedReader(new FileReader(dosyaYolu)))
        {
            String sihiriliSayi=okuyucu.readLine();
            String yorum=okuyucu.readLine();
            String[] boyut=okuyucu.readLine().split("");
            
            String maxDegerStr=okuyucu.readLine();
            System.out.println(boyut[0]+""+boyut[2]+""+maxDegerStr);
            
            int genislik=Integer.parseInt(boyut[0]);
            int yukseklik=Integer.parseInt(boyut[2]);
            int maxDeger=Integer.parseInt(maxDegerStr);
            
            int[]goruntuVerileri=new int[genislik*yukseklik];
            String line;
            
            while((line=okuyucu.readLine())!=null){
                String[] yenisatir=new String[line.length()];
                System.out.println(line);
            }
        }
             catch(IOException e){
                    e.printStackTrace();
                  }
            
            }
    
    }

