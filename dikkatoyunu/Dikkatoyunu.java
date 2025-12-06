/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dikkatoyunu;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author mertgurhan
 */
public class Dikkatoyunu extends JFrame implements MouseListener {
    private JButton button;
    private long baslamaZaman;
    private boolean tiklamaDurum=false;
    private int fareTiklama=0;
    private int hiz=500; //bu sayi azaldikça işlem hizlanicak
public Dikkatoyunu(){
    setTitle("Dikkat Oyunu");
   //setSize(400,300);
   setSize(600,400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);
    
    
    
    
    button=new JButton("Beni yakala!");
    button.setBounds(150,100,150,50);
    button.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        if(baslamaZaman==0){
        baslamaZaman=System.currentTimeMillis(); //baslama zamani al
    }
        else{
            long bitisZaman=System.currentTimeMillis();
            long gecenSure=(bitisZaman-baslamaZaman);
            JOptionPane.showMessageDialog(null, "GecenSure"+gecenSure);
            int puan=(int)((10000/gecenSure)*fareTiklama);
            JOptionPane.showMessageDialog(null,"Puan"+puan);
            baslamaZaman=0;//baslangiici sifirlama
            tiklamaDurum=true;
        }
    }
    
    });
    add(button);
    this.addMouseListener(this);
    Thread thread=new Thread(new Runnable(){
        public void run(){
            while(!tiklamaDurum){
                int x=(int) (Math.random()*(getWidth()-button.getWidth()));
                int y=(int) (Math.random()*(getWidth()-button.getWidth()));
            button.setLocation(x, y);
            
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
            });
            thread.start();
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
        public void run(){
            Dikkatoyunu frame=new Dikkatoyunu();
            frame.setVisible(true);
        }
    });
 
}
@Override
public void mouseClicked(MouseEvent e){
    fareTiklama++;
    System.out.println("Fare tiklandi");
}
@Override
 public void mousePressed(MouseEvent e){

 }
 @Override
 public void mouseReleased(MouseEvent e){
     
 }
 @Override
 public void mouseEntered(MouseEvent e){
     
 }
 @Override 
public void mouseExited(MouseEvent e){
    
}
}