/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cokbicimlilik;

/**
 *
 * @author mertgurhan
 */
public class VanCat  extends Cat{
    private boolean eyeColor;
    public VanCat(String name,int age,boolean eyeColor){
        super(name,age);
        this.eyeColor=eyeColor;
    }
    
    
    public boolean getEyeColor(){
        return this.eyeColor;
    }
    public void setEyeColor(boolean eyeColor){
        this.eyeColor=eyeColor;
    }
    
    public void ioCat(){
        
        if(this.eyeColor==true){
            System.out.println("Kedimizin adi:"+this.getName()+
                    "\nKedimizin yasi"+this.getAge()+"\n"
                            + "Kedimizin gozleri farkli renk");
            
        }
   //sor burayı
        else{
            System.out.println("Kedimizin adi:"+this.getName()+
                    "\nKedimizin yasi"+this.getAge()+"\n"
                            + "Kedimizin gozleri ayni renk"
            + "\nNesne yanlış yerde tanımlanmıştır, lütfen ait olduğu sınıfı düzeltiniz." + "\n");
        }
    }
    
}
