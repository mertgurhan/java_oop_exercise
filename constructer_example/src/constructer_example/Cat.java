/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructer_example;

/**
 *
 * @author mertgurhan
 */
public class Cat {
    
    public String name;
    private int age;
    public String color;
    int hungry;


//yapici ana
    public Cat(){
    this.name="isim yok";
    this.age=0;
    this.color="yok";
    this.hungry=0;


}       
    
    public Cat(String name,String color,int age,int hungry){
        
        
        
        this.name=name;
        this.color=color;
        this.age=age;
        this.hungry=hungry;
    }
    //getter
    public int getAge(){
        return age;
        
    }
    
public void setAge(int age){
this.age=age;

}

}


