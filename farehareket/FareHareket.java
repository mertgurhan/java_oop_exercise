/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farehareket;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author mertgurhan
 */
public class FareHareket extends JFrame implements MouseListener {

    Label etiket;
    FareHareket(){
        addMouseListener(this);
        etiket=new Label();
        etiket.setBounds(50,50,200,50);
        etiket.setBackground(Color.red);
        add(etiket);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FareHareket();
    }
    
    public void mouseClicked(MouseEvent e){
        etiket.setText("Fare Tiklandi");
    }
    public void mouseEntered(MouseEvent e){

        etiket.setText("Fare pencere üzerine geldi"+ e.getX()+""+e.getY());
}

    public void mouseExited(MouseEvent e){

        etiket.setText("Fare pencere üzerinden ayrildi");
}

    public void mousePressed(MouseEvent e){

        etiket.setText("Fare basildi");
}
        public void mouseReleased(MouseEvent e){

        etiket.setText("Fare birakildi");
        System.out.println("Fare birakildi");
}




}
