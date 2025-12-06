/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faretekerlek;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;
/**
 *
 * @author mertgurhan
 */
public class FareTekerlek extends JFrame implements MouseWheelListener{

    public FareTekerlek(){
        addMouseWheelListener(this);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FareTekerlek();
    }
    
    @Override
    public void mouseWheelMoved(MouseWheelEvent e){
        int tekerlekKonum=e.getWheelRotation();
        if(tekerlekKonum<0){
            System.out.println("Fare yukari haraket etti"+tekerlekKonum);
        }
        else{
            System.out.println("Fare assagi haraket etti"+tekerlekKonum);
        }
    }
}
