/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filewriter;

import java.io.File;

/**
 *
 * @author mertgurhan
 */
public class FileWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try{
        File dosya =new File("/Users/mertgurhan/Desktop/java_yaz.txt");
        if(dosya.createNewFile()){
            System.out.println("Dosya olusturuldu:"+dosya.getName());
        }
        FileWriter yazici=new FileWriter(dosya);
        yazici.write("Bu dosyaya yazilan metin.");
        yazici.close();
    }
    catch(Exception e){
        System.out.println("Bir hata olustu");
        e.printStackTrace();
    }
    
}

    private FileWriter(File dosya) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}