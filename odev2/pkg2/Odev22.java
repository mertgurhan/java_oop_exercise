/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odev2.pkg2;

/**
 *
 * @author mertgurhan
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Odev22 extends JPanel implements MouseMotionListener {

    private int fareX = 0;
    private int fareY = 0;

    public Odev22() {
        this.setPreferredSize(new Dimension(800, 600));
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        sekilleriCiz(g);
    }

    private void sekilleriCiz(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Fare konumuna göre dikdörtgen çiz
        int dikdortgenGenislik = 100;
        int dikdortgenYukseklik = 50;
        g2d.setColor(Color.RED);
        g2d.fillRect(fareX - dikdortgenGenislik / 2, fareY - dikdortgenYukseklik / 2, dikdortgenGenislik, dikdortgenYukseklik);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(fareX - dikdortgenGenislik / 2, fareY - dikdortgenYukseklik / 2, dikdortgenGenislik, dikdortgenYukseklik);

        // Fare konumuna göre daire çiz
        int daireCap = 50;
        g2d.setColor(Color.BLUE);
        g2d.fillOval(fareX - daireCap / 2, fareY - daireCap / 2, daireCap, daireCap);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(fareX - daireCap / 2, fareY - daireCap / 2, daireCap, daireCap);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        fareX = e.getX();
        fareY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        fareX = e.getX();
        fareY = e.getY();
        repaint();
    }

    public static void main(String[] args) {
        JFrame pencere = new JFrame("Dinamik Şekil Çizimi");
       Odev22 panel = new Odev22();
        pencere.add(panel);
        pencere.pack();
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setVisible(true);
    }
}
