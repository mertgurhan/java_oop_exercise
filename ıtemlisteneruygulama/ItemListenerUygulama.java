/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ıtemlisteneruygulama;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author mertgurhan
 */
public class ItemListenerUygulama implements ItemListener {

    JCheckBox onayKutu1,onayKutu2;
    JLabel etiket;
    
    public ItemListenerUygulama(){
        JFrame pencere=new JFrame("Itemlistener ornegi");
        pencere.setLayout(new FlowLayout());
        pencere.setSize(400,300);
        
        onayKutu1=new JCheckBox("secenek1");
        onayKutu2=new JCheckBox("secenek2");
        etiket=new JLabel("Bir seceek seciniz");
   
    onayKutu1.addItemListener(this);
    onayKutu2.addItemListener(this);
    
    pencere.add(onayKutu1);
    pencere.add(onayKutu2);
    pencere.add(etiket);
    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pencere.setVisible(true);
    
    
    
    }
    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==onayKutu1){
            etiket.setText("Secenek1"+(e.getStateChange()==ItemEvent.SELECTED ?"secildi": "deselect edildi"));
  
                    }
        else if(e.getSource()==onayKutu2){
             etiket.setText("Secenek1"+(e.getStateChange()==ItemEvent.SELECTED ?"secildi": "deselect edildi"));
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    new ItemListenerUygulama();
    }
    
}
