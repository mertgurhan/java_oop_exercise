/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faredurum;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
/**
 *
 * @author mertgurhan
 */
public class FareDurum extends JFrame implements MouseMotionListener {

    public void FareDurum(){
        addMouseMotionListener(this);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FareDurum();
    }
    @Override
    public void mouseDragged(MouseEvent e){
        System.out.println("Fare("+e.getX()+","+e.getY()+"konumuna sürüklendi.)");
        
    }
    @Override
  public void mouseMoved(MouseEvent e){
      System.out.println("Fare("+e.getX()+","+e.getY()+"konumuna tasindi)");
  }  
}
