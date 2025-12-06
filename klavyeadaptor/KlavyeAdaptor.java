/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klavyeadaptor;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author mertgurhan
 */
public class KlavyeAdaptor  extends JFrame{

    public KlavyeAdaptor(){
        addKeyListener(new KeyAdapter(){
        @Override
        public void keyPressed(KeyEvent e){
            System.out.println("Klavyeden tusa basildi:"+e.getKeyChar());
        }
    });
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new KlavyeAdaptor();
    }
    
}
