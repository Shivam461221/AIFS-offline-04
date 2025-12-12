/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlstatementbasics;

/**
 *
 * @author shiva
 */
public class Pattern {
    
    public static void printRightAngledTriangle(){
      for(int i=0;i<5;i++){
          
//          for(){
//              System.out.print(" ");
//          }
          
          for(int j=0; j<=i;j++){
              System.out.print(i+1+" ");
          }
          
          System.out.println();
      }
    }
    
    public static void main(String[] args) {
        printRightAngledTriangle();
    }
}
