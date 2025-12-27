/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package haviz;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author mertgurhan
 */
public class Haviz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService executor=Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
            Runnable isci=new calisanisparcacik("Görev"+(i+1));
            executor.execute(isci);
        }
        executor.shutdown();
    while(!executor.isTerminated()){
        
    }
    System.out.println("Tüm ıslem okey");
    }
    
}
