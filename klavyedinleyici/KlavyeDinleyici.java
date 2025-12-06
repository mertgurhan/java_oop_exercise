/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klavyedinleyici;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author mertgurhan
 */
public class KlavyeDinleyici extends JFrame implements KeyListener {

    public KlavyeDinleyici(){
        addKeyListener(this);
        setSize(300,300);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new KlavyeDinleyici();
    }
    
    @Override
    public void keyTyped(KeyEvent e){
        System.out.println("Klavyeden yazildi:"+e.getKeyCode());
    }
    
    @Override 
    public void keyPressed(KeyEvent e){
        System.out.println("Tusa basildi"+e.getKeyCode());
        if(e.getKeyCode()==KeyEvent.VK_UP){
            System.out.println("Yukari tusa basildi");
        }
      
    }
    @Override 
    public void keyReleased(KeyEvent e){
        System.out.println("Tus birakildi"+e.getKeyChar());
    }
}
