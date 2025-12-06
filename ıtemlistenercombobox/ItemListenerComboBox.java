/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ıtemlistenercombobox;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
        /**
 *
 * @author mertgurhan
 */
public class ItemListenerComboBox  implements ItemListener{

    JComboBox<String>combobox;
    JLabel label;
    public ItemListenerComboBox(){
        JFrame frame=new JFrame("Comboox örnegi");
        frame.setLayout(new FlowLayout());
        frame.setSize(400,200);
        
        String[] items={
            "Oge1","Oge2","Oge3","Oge4" };
        
        combobox=new JComboBox<>(items);
        label=new JLabel("Bir ogre seciniz");
        combobox.addItemListener(this);
        frame.add(combobox);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange()==ItemEvent.SELECTED){
            label.setText("Secilen"+e.getItem().toString());
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ItemListenerComboBox();
    }
    
}
