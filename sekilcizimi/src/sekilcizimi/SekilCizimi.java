/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sekilcizimi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SekilCizimi extends JPanel implements MouseListener {

    private enum SekilTipi {DIKDORTGEN, DAIRE}

    private SekilTipi seciliSekil;
    private final List<Sekil> sekiller = new ArrayList<>();
    private final Random rastgele = new Random();

    public SekilCizimi() {
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.WHITE);
        this.addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Sekil sekil : sekiller) {
            sekil.ciz(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (seciliSekil != null) {
            int x = e.getX();
            int y = e.getY();
            Color rastgeleRenk = new Color(rastgele.nextInt(256), rastgele.nextInt(256), rastgele.nextInt(256));
            switch (seciliSekil) {
                case DIKDORTGEN:
                    sekiller.add(new Dikdortgen(x, y, 100, 50, rastgeleRenk));
                    break;
                case DAIRE:
                    sekiller.add(new Daire(x, y, 50, rastgeleRenk));
                    break;
            }
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        JFrame pencere = new JFrame("Şekil Çizimi");
        SekilCizimi panel = new SekilCizimi();

        JButton dikdortgenButon = new JButton("Dikdörtgen");
        dikdortgenButon.addActionListener(e -> panel.seciliSekil = SekilTipi.DIKDORTGEN);

        JButton daireButon = new JButton("Daire");
        daireButon.addActionListener(e -> panel.seciliSekil = SekilTipi.DAIRE);

        JPanel butonPaneli = new JPanel();
        butonPaneli.add(dikdortgenButon);
        butonPaneli.add(daireButon);

        pencere.add(panel, BorderLayout.CENTER);
        pencere.add(butonPaneli, BorderLayout.SOUTH);
        pencere.pack();
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setVisible(true);
    }

    abstract static class Sekil {
        int x, y;
        Color renk;

        public Sekil(int x, int y, Color renk) {
            this.x = x;
            this.y = y;
            this.renk = renk;
        }

        abstract void ciz(Graphics g);
    }

    static class Dikdortgen extends Sekil {
        int genislik, yukseklik;

        public Dikdortgen(int x, int y, int genislik, int yukseklik, Color renk) {
            super(x, y, renk);
            this.genislik = genislik;
            this.yukseklik = yukseklik;
        }

        @Override
        void ciz(Graphics g) {
            g.setColor(renk);
            g.fillRect(x - genislik / 2, y - yukseklik / 2, genislik, yukseklik);
            g.setColor(Color.BLACK);
            g.drawRect(x - genislik / 2, y - yukseklik / 2, genislik, yukseklik);
        }
    }

    static class Daire extends Sekil {
        int cap;

        public Daire(int x, int y, int cap, Color renk) {
            super(x, y, renk);
            this.cap = cap;
        }

        @Override
        void ciz(Graphics g) {
            g.setColor(renk);
            g.fillOval(x - cap / 2, y - cap / 2, cap, cap);
            g.setColor(Color.BLACK);
            g.drawOval(x - cap / 2, y - cap / 2, cap, cap);
        }
    }
}
