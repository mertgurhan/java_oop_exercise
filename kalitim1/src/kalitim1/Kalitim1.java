/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalitim1;

/**
 *
 * @author mertgurhan
 */
public class Kalitim1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Doktor doktor=new Doktor("Ahmet","Yılmaz","Genel Cerrahi");
       Hemsire hemsire=new Hemsire("Ayse","Aslan");
        Hasta hasta=new Hasta("Mehmet","Basaran");
        hasta.GirisYap();
        hasta.RandevuAl(doktor);
        doktor.GirisYap();
        doktor.MuayaneYap(hasta);
        hemsire.GirisYap();
        hemsire.AsiYap(hasta);
        hemsire.TahlilYap(hasta);
        hemsire.KanTestiYap(hasta);
        hasta.CikisYap();
        doktor.CikisYap();
        hemsire.CikisYap();
    }
    
}
