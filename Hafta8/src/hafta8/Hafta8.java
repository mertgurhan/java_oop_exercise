/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hafta8;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
/**
 *
 * @author mertgurhan
 */
public class Hafta8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String>arraylist=new ArrayList<>();
        
        
        arraylist.add("elma");
        arraylist.add("armut");
        arraylist.add("karpuz");
        arraylist.add("erik");
        arraylist.add("kavun");
        arraylist.add("cağla");
        arraylist.add("vişne");
        arraylist.add("uzum");
        arraylist.add("cilek");
        arraylist.add("ejder meyvesi");
        
if(arraylist.contains("kavun")==true){
    System.out.println("kavun bulundu");
    arraylist.clear();
        System.out.println(arraylist.isEmpty());

}
else{
    System.out.println("Kavun bulunamadı iste diger meyveler\n");
    System.out.println(arraylist);
}
       
        List<Integer> linkedlist=new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(11);
        linkedlist.add(12);
        linkedlist.add(13);
        linkedlist.add(14);
        linkedlist.add(15);
        linkedlist.add(16);
        linkedlist.add(17);
        linkedlist.add(18);
        linkedlist.add(19);
        linkedlist.add(20);
  System.out.println(  linkedlist.size());
        
        
        
      List<Float>vector=new Vector<>( );
        vector.add(1.1f);
        vector.add(2.2f);
        vector.add(3.3f);
        vector.add(4.4f);
        vector.add(5.5f);
        vector.add(6.6f);
        vector.add(7.7f);
        vector.add(8.8f);
        vector.add(9.9f);
        vector.add(10.10f);
      
         System.out.println(vector);
         
        ListeYazdir(arraylist);

    }
       public static <T> void ListeYazdir(List<T> l){
        for (T i : l) {
            System.out.println(i);
        }

}
}
