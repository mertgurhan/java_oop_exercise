/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cokbicimlilik;

/**
 *
 * @author mertgurhan
 */
public class Cat {
    
    private String name;
    private int age;
    
    
    
    public Cat(){
        
        this.name="İsim degeri girilmedi";
        this.age=0;
        
    }
    
    
    public Cat(String name,int age){
        
        this.name=name;
        this.age=age;
        
    }
    
    public String getName(){
        return this.name;
        
    }
    public int getAge(){
        return this.age;
    }
    
    public void setName(String name){
        
        this.name=name;
        
    }
    public void setAge(int Age){
        this.age=age;
    }
    
    public void ioCat(){
        System.out.println("Kedimizin adi:"+this.getName()+"\nkedimizin yasi"+
                this.getAge()+"\n");
    }
    
}
