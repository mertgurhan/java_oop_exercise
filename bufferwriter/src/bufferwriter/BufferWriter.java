/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class BufferWriter {

    public static void main(String[] args) {
        try {
            File dosya = new File("/Users/mertgurhan/Desktop/java.txt");

            BufferedWriter yazici = new BufferedWriter(new FileWriter(dosya, Charset.forName("UTF-8")));

            // Dosyaya yazılacak metin
            String metin = "Bu bir yazıcı uygulamasıdır.";

            // Metni dosyaya yaz
            yazici.write(metin);
            
            // BufferedWriter kapat
            yazici.close();

            System.out.println("Dosyaya yazma işlemi tamamlandı.");

        } catch (IOException e) {
            System.out.println("Dosya yazma hatası: " + e.getMessage());
        }
    }
}
