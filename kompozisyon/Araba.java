/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kompozisyon;

/**
 *
 * @author mertgurhan
 */
public class Araba {
    private String marka;
    private String model;
    private Motor motor;
    private Direksiyon direksiyon;
    public Araba(String Marka,String mode,Motor motor,Direksiyon direksiyon){
        this.marka=marka;
        this.model=model;
        this.motor=motor;
        this.direksiyon=direksiyon;
}
    public void hareketeGec(){
    motor.calistir();
    System.out.println(marka+" "+model+" hareket etti");
}
    public void DonusYap(String Yon){
    switch(String.valueOf(Yon)){
        case "Sag":
            direksiyon.SagaDon();
            break;
        case "Sol":
            direksiyon.SolaDon();
            break;
        default:
            System.out.println("yon bilgisi yok");
    }

}
}