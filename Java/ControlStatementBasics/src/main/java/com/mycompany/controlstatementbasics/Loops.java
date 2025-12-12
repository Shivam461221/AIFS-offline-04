/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlstatementbasics;

public class Loops {
    
    public static void main(String[] args) {
        //loops - while, do-while, for, forEach
        
        int i = 0;
        
//        while(i<=10){
//            System.out.println("Hello Java"+ (i+1));
//            i++;
//        }
//        
        do{
            System.out.println("i= "+i);
            i++;
        } while(false);
        
        
//        for(int j=0; j<10;j++){
//            System.out.println("j= "+j);
//        }
        
       for(int j=10;j>=0;j--){
           System.out.println("j = "+j);
       }
    }
}
