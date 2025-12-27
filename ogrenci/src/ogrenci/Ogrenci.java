/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ogrenci;

/**
 *
 * @author mertgurhan
 */
public class Ogrenci {
private String ad;
private int yas;
private double harcUcreti;
static String universite="KSBU";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println(Ogrenci.universite);
            Ogrenci.getUniversite();
           Ogrenci o1 = new Ogrenci();
           o1.setAd("");
           o1.setYas(-1);
           o1.setHarcUcreti(0);
    
    }
    static void getUniversite(){
        System.out.println(Ogrenci.universite);
    }
 public String getAd(){
     return ad;
 }   
public void setAd(String yeniAd){
    if(!yeniAd.equals("")){
        this.ad=yeniAd;
    }
    else{
        System.out.println("Lutfen en az 3 harften olusan bir isim giriniz");
    }
}

public int getYas(){
    return yas;
}

public void setYas(int Yas){
    if(Yas>0){
        this.yas=Yas;
    }
    else{
        System.out.println("Lutfen 0 dan buyuk bir yas gir");
    }
}
public double getHarcUcreti(){
    return harcUcreti;
}
public void setHarcUcreti(double value){
    
    if(value>0){
        harcUcreti=value;
    }
    else{
        System.out.println("Lutfen sıfırdan buuyk bir harc ucreti giriniz");
         }
    
    
    }
}
