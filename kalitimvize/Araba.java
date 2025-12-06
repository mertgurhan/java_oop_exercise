/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalitimvize;

/**
 *
 * @author mertgurhan
 */
public class Araba extends Arac {
    
    private int motorHacmi;
    private String yakitTuru;
    
    
    
    public Araba(String marka,String model,int uretimYili,int motorHacmi,String yakitTuru){
        
        super(marka,model,uretimYili);
        this.motorHacmi=motorHacmi;
        this.yakitTuru=yakitTuru;
    }
    
    
    public int getMotorHacmi(){
        return motorHacmi;
    }
    public String getYakitTuru(){
        return yakitTuru;
    }
    
    public void setMotorHacmi(){
        this.motorHacmi=motorHacmi;
    }
    public void setYakitTuru(){
        this.yakitTuru=yakitTuru;
    }
    
    public void parkEt(){
        System.out.println("Arac park edildi");
    }
    public void hizlan(){
        System.out.println("Arac hizlandi");
    }
    
    
    
}
