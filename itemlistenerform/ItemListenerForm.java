/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package itemlistenerform;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ItemListenerForm implements ItemListener {

    JCheckBox javaCheckBox, pythonCheckBox, cppCheckBox;
    JLabel label;

    public ItemListenerForm() {
        JFrame frame = new JFrame("Programlama Dili Tercihi");
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 200);

        javaCheckBox = new JCheckBox("Java");
        pythonCheckBox = new JCheckBox("Python");
        cppCheckBox = new JCheckBox("C++");

        javaCheckBox.addItemListener(this);
        pythonCheckBox.addItemListener(this);
        cppCheckBox.addItemListener(this);

        label = new JLabel("Seçilen Diller:"); // Label'ı başlatıyoruz.

        frame.add(javaCheckBox);
        frame.add(pythonCheckBox);
        frame.add(cppCheckBox);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        StringBuilder selectedLanguages = new StringBuilder("Seçilen Diller: ");
        if (javaCheckBox.isSelected()) {
            selectedLanguages.append("Java ");
        }
        if (pythonCheckBox.isSelected()) {
            selectedLanguages.append("Python ");
        }
        if (cppCheckBox.isSelected()) {
            selectedLanguages.append("C++ ");
        }
        label.setText(selectedLanguages.toString()); // Label'ın metnini güncelliyoruz.
    }

    public static void main(String[] args) {
        new ItemListenerForm();
    }
}
