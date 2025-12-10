
package com.mycompany.second;

public class Mobile {
    String brand;  //literals
    String model;
    
    String color;
    
    String varient;
    
    double price ;
    
    public void calling(){
        
    }
    
    public void recording(){
        
    }
    
    
    public static void main(String[] args) {
        Mobile samsung = new Mobile();
        
        samsung.price = 15000;
        
        Mobile nokia = new Mobile();
        
        nokia.price = 12000;
        
        System.out.println("Samsung price "+samsung.price);
        
        System.out.println("Nokia price "+ nokia.price);
    }
}
