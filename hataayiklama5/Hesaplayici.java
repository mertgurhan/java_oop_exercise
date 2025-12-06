/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hataayiklama5;

/**
 *
 * @author mertgurhan
 */
public class Hesaplayici {
    public int toplama(int sayi1,int sayi2)throws AritmetikToplaHatasiException{
        if(sayi1==0 || sayi2==0){
            throw new AritmetikToplaHatasiException("Sifirdan farkli sayi giriniz");
        }
    return sayi1+sayi2;
    }
       
}

