/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vizehazirlik2;

/**
 *
 * @author mertgurhan
 */
public class VizeHazirlik2 {

     private int yas;
   private String ad;
    private double harcUcreti;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VizeHazirlik2 o1=new VizeHazirlik2 ();
        o1.setAd("");
        o1.setYas(-1);
        o1.setHarcUcreti(0);
        
        
    }
    public String getAd(){
        return ad;
    }
    public void setAd(String yeniAd){
        if(!yeniAd.equals("")){
            this.ad=yeniAd;
        }
        else{
            System.out.println("Lutfen en az 3 harften oluşan bir isim giriniz:");
        }
    }
    
    
    public int getYas(){
        return yas;
    }
    public void setYas(int Yas){
        
        if(yas<0){
            System.out.println("Lutfen gecerli bir ad giriniz!");
        }
        else{
            this.yas=Yas;
        }
    }
    public double getHarcUcreti(){
      return harcUcreti;     

    }
    
    
    public void setHarcUcreti(double value){
        if(value>0){
            this.harcUcreti=value;
        }
        else{
            System.out.println("Lutfen sifridan buyuk bir harc ucreti griiniz");
        }
    }
    
}
