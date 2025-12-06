/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ıtemlistenertogglebutton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author mertgurhan
 */
public class ItemListenerToggleButton implements ItemListener {

    JToggleButton toggleButton;
    JLabel label;
    
    public ItemListenerToggleButton(){
        JFrame frame=new JFrame("ToggleButton Örnegi");
        frame.setLayout(new FlowLayout());
        frame.setSize(400,200);
        
        toggleButton=new JToggleButton("Acik/Kapali");
        label=new JLabel("Durum:Kapali");
        
        toggleButton.addItemListener(this);
        frame.add(toggleButton);
        frame.add(label);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void itemStateChanged(ItemEvent e){
        if(toggleButton.isSelected()){
            label.setText("Durum:Acil");
        }
        else{
            label.setText("Durum:Kapali");
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ItemListenerToggleButton();
    }
    
}
