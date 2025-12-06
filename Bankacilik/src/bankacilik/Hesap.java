/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankacilik;

/**
 *
 * @author mertgurhan
 */
abstract class Hesap {
    protected double bakiye;
    public Hesap(double bakiye){
        this.bakiye=bakiye;
    }
    
    public abstract void paraYatir(double miktar);
    public abstract void paraCek(double miktar);
    public abstract void bakiyeSorgula();
    
}
