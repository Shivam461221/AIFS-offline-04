/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlstatementbasics;

/**
 *
 * @author shiva
 */
public class B {
    
//    public void evenNumbers(){
//        for(int i=1; i<=100;i++){
//           if(i%2==0){
//               System.out.println(i);
//           }
//        }
//    }
    
     public static void evenNumbers(){
        for(int i=100; i>=1;i--){
           if(i%2!=0){
               System.out.println(i);
           }
        }
    }
    
    public static void main(String[] args) {
        //B obj = new B();
       // obj.evenNumbers();
       evenNumbers();
       
         String output =  (10%2==0) ? "Even" : "odd";
      
        System.out.println(output);
    }
}
