/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev2;

/**
 *
 * @author mertgurhan
 */
public class Araba extends Arac {
    private int kapi;
    private boolean donustur;//internetten baktım

public Araba(String Marka,int yil,int topspeed,int kapi,boolean donustur){
    super(Marka,yil,topspeed);
    this.kapi=kapi;
    this.donustur=donustur;
}
public int getKapi(){
    return kapi;
}
public boolean Donus(){
    return donustur;
}
public void kornacal(){
    System.out.println("Araba korna calisiyor");
}
public void sur(){
    
    System.out.println("Araba suruyor");
}
}
