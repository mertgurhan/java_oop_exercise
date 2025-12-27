/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vizehazirlik3;

/**
 *
 * @author mertgurhan
 */
public class VizeHazirlik3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Doktor doktor=new Doktor("Ali","Gurhan","Genel Cerrahi");
       Hemsire hemsire=new Hemsire("Ayse","Aslan");
       Hasta hasta=new Hasta("Recep","Tayyip");
      
       
       hasta.GirisYap();
       hasta.RandevuAl(doktor);
       doktor.GirisYap();
       doktor.IlacYaz(hasta);
       doktor.MuayaneYap(hasta);
       doktor.TedaviYap(hasta);
       hemsire.GirisYap();
       hemsire.AsiYap(hasta);
       hemsire.KanTestiYap(hasta);
       hemsire.TahlilYap(hasta);
       doktor.CikisYap();
       hemsire.CikisYap();
       hasta.CikisYap();
       hemsire.SaxoCek(doktor);
    }
    
}
