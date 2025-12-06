/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odev2.pkg1;

/**
 *
 * @author mertgurhan
 */
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Odev21 extends JPanel {

    private static final int PANEL_GENISLIK = 800;
    private static final int PANEL_YUKSEKLIK = 600;

    public Odev21() {
        this.setPreferredSize(new Dimension(PANEL_GENISLIK, PANEL_YUKSEKLIK));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        sekilleriCiz(g);
    }

    private void sekilleriCiz(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Rastgele renkleri tanımla
        Color[] renkler = new Color[4];
        Random rastgele = new Random();
        for (int i = 0; i < renkler.length; i++) {
            renkler[i] = new Color(rastgele.nextInt(256), rastgele.nextInt(256), rastgele.nextInt(256));
        }

        // Şekilleri çiz
        int x = 50;
        int y = 50;
        int boyut = 100;

        // Kare
        g2d.setColor(renkler[0]);
        g2d.fillRect(x, y, boyut, boyut);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Kare", x + boyut / 2 - 15, y + boyut + 15);

        // Dikdörtgen
        x += 150;
        g2d.setColor(renkler[1]);
        g2d.fillRect(x, y, boyut, boyut / 2);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Dikdörtgen", x + boyut / 2 - 30, y + boyut / 2 + 15);

        // Elips
        x += 150;
        g2d.setColor(renkler[2]);
        g2d.fillOval(x, y, boyut, boyut / 2);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Elips", x + boyut / 2 - 20, y + boyut / 2 + 15);

        // Daire
        x = 50;
        y += 150;
        g2d.setColor(renkler[3]);
        g2d.fillOval(x, y, boyut, boyut);
        g2d.setColor(Color.ORANGE);
        g2d.drawString("Daire", x + boyut / 2 - 20, y + boyut + 15);

        // Çokgen (Üçgen)
        x += 150;
        int[] xNoktalari = {x, x + boyut / 2, x + boyut};
        int[] yNoktalari = {y + boyut, y, y + boyut};
        g2d.setColor(renkler[0]);
        g2d.fillPolygon(xNoktalari, yNoktalari, 3);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Üçgen", x + boyut / 2 - 20, y + boyut + 15);
    }

    public static void main(String[] args) {
        JFrame pencere = new JFrame("Statik Şekil Çizimi");
        Odev21 panel = new Odev21();
        pencere.add(panel);
        pencere.pack();
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 pencere.setVisible(true);
    }
}