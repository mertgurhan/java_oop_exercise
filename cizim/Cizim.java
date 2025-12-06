/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cizim;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
/**
 *
 * @author mertgurhan
 */
public class Cizim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame pencere=new JFrame("Basit cizim");
        
        Panellecizim cizim1=new Panellecizim();
        TuvalleCizim cizim2=new TuvalleCizim();
        pencere.add(cizim1);
        pencere.setSize(400,400);
        pencere.add(cizim2);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setVisible(true);
        
    }
    
}
